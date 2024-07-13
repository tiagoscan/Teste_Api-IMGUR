package com.example.teste_api_imgur.api

import com.example.teste_api_imgur.api.model.Resultado
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ImgurAPI {

    @GET("gallery/search/")//?q=cats
    suspend fun pesquisarImagensGaleria(
        @Query("q") q: String
    ) : Response<Resultado>
}