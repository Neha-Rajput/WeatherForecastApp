package com.example.app.weatherapp.ui.weather_detail.weatherHourOfDay

import androidx.databinding.ObservableField
import com.example.app.weatherapp.core.BaseViewModel
import com.example.app.weatherapp.domain.model.ListItem
import javax.inject.Inject



class WeatherHourOfDayItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<ListItem>()
}
