package com.example.app.weatherapp.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.example.app.weatherapp.db.entity.CitiesForSearchEntity
import com.example.app.weatherapp.repo.SearchCitiesRepository
import com.example.app.weatherapp.ui.search.SearchViewState
import com.example.app.weatherapp.utils.UseCaseLiveData
import com.example.app.weatherapp.utils.domain.Resource
import javax.inject.Inject



class SearchCitiesUseCase @Inject internal constructor(
    private val repository: SearchCitiesRepository
) : UseCaseLiveData<SearchViewState, SearchCitiesUseCase.SearchCitiesParams, SearchCitiesRepository>() {

    override fun getRepository(): SearchCitiesRepository = repository

    override fun buildUseCaseObservable(params: SearchCitiesParams?): LiveData<SearchViewState> {
        return repository.loadCitiesByCityName(
            cityName = params?.city ?: ""
        ).map {
            onSearchResultReady(it)
        }
    }

    private fun onSearchResultReady(resource: Resource<List<CitiesForSearchEntity>>): SearchViewState {
        return SearchViewState(
            status = resource.status,
            error = resource.message,
            data = resource.data
        )
    }

    class SearchCitiesParams(
        val city: String = ""
    ) : Params()
}
