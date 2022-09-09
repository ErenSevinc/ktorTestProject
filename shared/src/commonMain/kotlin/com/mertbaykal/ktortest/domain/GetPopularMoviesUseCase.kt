package com.mertbaykal.ktortest.domain

import com.mertbaykal.ktortest.base.BaseUseCase
import com.mertbaykal.ktortest.data.network.repositories.DataRepository
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.Flow

class GetPopularMoviesUseCase constructor(
    private val repository: DataRepository = DataRepository()
): BaseUseCase<Unit, HttpResponse>() {

    override fun buildUseCase(params: Unit): Flow<HttpResponse> {
        return repository.getPopularMovies()
    }
}