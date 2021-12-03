# WeatherForecastApp
Weather Forecast app in kotlin
## Introduction
Here is the kotlin android application which showing weather forecast for perticular city.
by Using API](http://openweathermap.org/forecast5) to retrieve the current 5 day weather forecast.


## Use and Run the app
* Install the apk from Link in android device.
* Makesure you have active network(Data or WIFI)
* open the app you will get the splash screen, after splash screen(first screen)you will able to see the search bar int top most of the dashboad screen
i.e (second screen). 
* please enter the city name and select the suitble city from the search bar of city display in list.
and after selecting the city you will able to see the current weather and future weather forcast cards in app.
* user can also see the details of future weather forcast in detail by selecting the spasific card and you will navigte to the details forecast screen.

## Tools 

* Macbook Pro 15
* Android Studio (version 4.2).
* If kotlin plugin is not installed in Android Studio.
* install Kotlin plugin in Android Studio.

 File-> Setting-> plugin -> MarketPlace -> type kotlin in search bar -> Install -> Apply-> ok.
 
* Minimum SDK version 19.
* Compile SDK version 30.
* Testing Mobile Device (Android version 10).

## Architecture - MVVM
MVVM architecture is a Model-View-ViewModel architecture that removes the tight coupling between each component. Most importantly, in this architecture, the children don't have the direct reference to the parent, they only have the reference by observables.

## Declaring dependencies


## Retrofit2
Retrofit is used for calling networking API through request URL and getting result in a response in gson. 
Retrofit is a REST Client for Java and Android. It makes it relatively easy to retrieve and upload JSON (or other structured data) via a REST based webservice. In Retrofit you configure which converter is used for the data serialization.
```
   retrofit2:'com.squareup.retrofit2:retrofit:(insert version)'
   Gson: 'com.squareup.retrofit2:converter-gson :(insert version)'
   Jackson: 'com.squareup.retrofit2:converter-jackson: (insert version)'
   Moshi: 'com.squareup.retrofit2:converter-moshi:(insert version)'
```

## Dependency injection

Hilt provides a standard way to use DI in your application by providing containers for every Android class in your project and managing their lifecycles automatically. Hilt is built on top of the popular DI library Dagger to benefit from the compile-time correctness, runtime performance, scalability, and Android Studio support that Dagger provides. For more information, see https://developer.android.com/training/dependency-injection/hilt-android#hilt-and-dagger.

```
Hilt/dagger :com.google.dagger:hilt-android-gradle-plugin:(insert version)"
```

## Lifecycle and Viewmodel

Lifecycle-aware components perform actions in response to a change in the lifecycle status of another component, such as activities and fragments. These components help you produce better-organized, and often lighter-weight code, that is easier to maintain.

```
lifecycleExt: "androidx.lifecycle:lifecycle-extensions:(insert version)"
lifecycleAnnotation :"androidx.lifecycle:lifecycle-compiler:(insert version)"
liveData kotlin : "androidx.lifecycle:lifecycle-livedata-ktx:(insert version)"
lifecycleViewModel kotlin : "androidx.lifecycle:lifecycle-viewmodel-ktx:(insert version)"

```
## Room

 The Room persistence library provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of      SQLite.
 
```
    Room :"androidx.room:room-runtime:(insert version)"
    Room compiler: "androidx.room:room-compiler:(insert version)"
```
## Navigation Component

Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app. 

```
Navigation  : "androidx.navigation:navigation-fragment-ktx:(insert version)"
             "androidx.navigation:navigation-ui-ktx:(insert version)"
```
## Piccaso

A powerful image downloading and caching library for Android.

```
"com.squareup.picasso:picasso:(insert version)"
```

## Testing
Testing your app is an integral part of the app development process. By running tests against your app consistently, you can verify your app's correctness, functional behavior, and usability before you release it publicly.

``` 
junit = "junit:junit:${Versions.junitVersion}"
androidxTestRunner : "androidx.test:runner:${Versions.androidxTestRunnerVersion}"
androidxTestRules : "androidx.test:rules:${Versions.androidxTestRunnerVersion}"
junitTestExt : "androidx.test.ext:junit-ktx:${Versions.junitExtVersion}"
espressoCore : "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
mockK : "io.mockk:mockk:${Versions.mockKVersion}"
coreTesting : "androidx.arch.core:core-testing:${Versions.coreTestingVersion}"
robolectric :"org.robolectric:robolectric:${Versions.robolectricVersion}"
```

## Get Clone and run project in Android Studio
Use Git commands for clone code from the repository.
Clone
Use git clone command to clone repository
```
git clone https://github.com/Neha-Rajput/
```
After successful cloning of project open project in Android Studio.

Android Studio -> File -> Open
select file "Weather app" -> OK

Run Project 
Android Studio -> Run -> Run "app"

Select emulator or connect a real Android device and if you run the app in real Android Device make debugging mode ON.

Mobile Debugging select below option in phone.

Setting -> Additional Setting -> Developer Option - > USB Debugging 
<img width="323" alt="Screenshot 2021-12-03 at 10 17 56" src="https://user-images.githubusercontent.com/22030444/144620303-5b93a364-c2e2-40e0-b853-338e2a196b89.png">

make USB Debuggin ON.

Finally App run in you phone and its look like:

