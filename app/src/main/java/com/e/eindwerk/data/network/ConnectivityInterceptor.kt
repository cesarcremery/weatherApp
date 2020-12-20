package com.e.eindwerk.data.network

import okhttp3.Interceptor

//interface voor het opvangen van de app indien geen internet => zorgen dat de app niet crasht
interface connectivityInterceptor : Interceptor