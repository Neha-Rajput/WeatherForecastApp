package com.example.app.weatherapp.ui.search

import com.example.app.weatherapp.core.BaseViewState
import com.example.app.weatherapp.db.entity.CitiesForSearchEntity
import com.example.app.weatherapp.utils.domain.Status



class SearchViewState(
    val status: Status,
    val error: String? = null,
    val data: List<CitiesForSearchEntity>? = null
) : BaseViewState(status, error) {
    fun getSearchResult() = data
}
