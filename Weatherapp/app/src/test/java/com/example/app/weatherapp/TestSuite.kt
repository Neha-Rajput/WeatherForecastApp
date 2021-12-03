package com.example.app.weatherapp

import android.os.Build
import com.example.app.weatherapp.dao.CitiesForSearchDaoTest
import com.example.app.weatherapp.dao.CurrentWeatherDaoTest
import com.example.app.weatherapp.dao.ForecastDaoTest
import com.example.app.weatherapp.repo.CurrentWeatherRepositoryTest
import com.example.app.weatherapp.repo.ForecastRepositoryTest
import com.example.app.weatherapp.viewModel.DashboardViewModelTest
import com.example.app.weatherapp.viewModel.SearchViewModelTest
import com.example.app.weatherapp.viewModel.WeatherDetailViewModelTest
import com.example.app.weatherapp.viewState.CurrentWeatherViewStateTest
import com.example.app.weatherapp.viewState.ForecastViewStateTest
import com.example.app.weatherapp.viewState.SearchViewStateTest
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.robolectric.annotation.Config



@Config(sdk = [Build.VERSION_CODES.R])
@RunWith(Suite::class)
@Suite.SuiteClasses(
    CitiesForSearchDaoTest::class,
    CurrentWeatherDaoTest::class,
    CurrentWeatherViewStateTest::class,
    DashboardViewModelTest::class,
    ForecastDaoTest::class,
    ForecastViewStateTest::class,
    SearchViewStateTest::class,
    SearchViewModelTest::class,
    WeatherDetailViewModelTest::class,
    ForecastRepositoryTest::class,
    CurrentWeatherRepositoryTest::class
)
class TestSuite
