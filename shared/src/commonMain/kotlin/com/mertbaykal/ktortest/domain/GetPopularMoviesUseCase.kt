package com.mertbaykal.ktortest.domain

import com.mertbaykal.ktortest.base.BaseUseCase
import com.mertbaykal.ktortest.data.model.MovieResult
import com.mertbaykal.ktortest.data.network.repositories.DataRepository
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.Flow

class GetPopularMoviesUseCase constructor(
    private val repository: DataRepository = DataRepository()
): BaseUseCase<Unit, MovieResult>() {

    override fun buildUseCase(params: Unit): Flow<MovieResult> {
        return repository.getPopularMovies()
    }
}