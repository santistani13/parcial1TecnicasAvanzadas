package com.example.parcial1recetas

data class Receta(
     val id: Int,
     val nombre: String,
     val origen: String,
     val dificultad: String,
     val ingredientes: List<String>,
     val imagenReceta: String?
)
