package com.example.session1

data class ModelTwo(
    val movieId : String,
    val name : String,
    val description : String,
    val age : String,
    val images : List<String>,
    val poster : String,
    val tags : List<ModelIII>
)
