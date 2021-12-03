package com.example.app.weatherapp.ui.dashboard

import com.example.app.weatherapp.core.BaseViewState
import com.example.app.weatherapp.db.entity.CurrentWeatherEntity
import com.example.app.weatherapp.utils.domain.Status


class CurrentWeatherViewState(
    val status: Status,
    val error: String? = null,
    val data: CurrentWeatherEntity? = null
) : BaseViewState(status, error) {
    fun getForecast() = data
}
