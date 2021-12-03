package com.example.app.weatherapp.ui.dashboard

import com.example.app.weatherapp.core.BaseViewState
import com.example.app.weatherapp.db.entity.ForecastEntity
import com.example.app.weatherapp.utils.domain.Status



class ForecastViewState(
    val status: Status,
    val error: String? = null,
    val data: ForecastEntity? = null
) : BaseViewState(status, error) {
    fun getForecast() = data
}
