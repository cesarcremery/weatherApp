package com.e.eindwerk.data.network

import com.e.eindwerk.data.network.response.CurrentWeatherResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY ="6e7d949f1a114a3188271652200710"

//http://api.weatherapi.com/v1/forecast.json?key=6e7d949f1a114a3188271652200710&q=Gent


//interface voor het fetchen van de json data
interface OpenWeatherApiService {
    @GET("current.json")
    fun getCurrentWeather(
            @Query("q") locatie: String
    ) : Deferred<CurrentWeatherResponse>


    companion object {
        operator fun invoke(
             connectivityInterceptor: connectivityInterceptor
        ): OpenWeatherApiService {
            val requestInterceptor = Interceptor { chain ->

                val url = chain.request()
                        .url
                        .newBuilder()
                        .addQueryParameter("key", API_KEY)
                        .build()

                val request = chain.request()
                        .newBuilder()
                        .url(url)
                        .build()

                return@Interceptor chain.proceed(request)
            }

            val okHttpClient = OkHttpClient.Builder()
                    .addInterceptor(requestInterceptor)
                    .addInterceptor(connectivityInterceptor) //Checkt of toestel verbonden is met internet en zorgt ervoor dat de app niet crasht maar gewoon geen data toont
                    .build()

            return Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl("https://api.weatherapi.com/v1/")
                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(OpenWeatherApiService::class.java)
        }
    }
}