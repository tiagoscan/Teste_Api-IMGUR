package com.example.teste_api_imgur.api.model

data class Resultado(
    val `data`: List<Data>,
    val status: Int,
    val success: Boolean
)