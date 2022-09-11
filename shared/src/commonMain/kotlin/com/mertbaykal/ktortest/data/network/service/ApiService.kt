package com.mertbaykal.ktortest.data.network.service

import com.mertbaykal.ktortest.data.model.MovieResult
import io.ktor.client.*
import io.ktor.client.statement.*

interface ApiService  {

    suspend fun getPopularMovies(): MovieResult
}