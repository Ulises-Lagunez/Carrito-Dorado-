package com.example.myapplication.data

import com.example.carritodorado.R

data class Producto(val id:Int, val nombre:String, val imagen:Int, val categoria:String)

object RepositorioProductos{

    val listaProductos = listOf(
        Producto(1,"Naranjas",R.drawable.prod1, "Frutas y Verduras"),
        Producto(2,"Pechuga de pollo",R.drawable.prod2, "Carnes"),
        Producto(3,"Huevos",R.drawable.prod3, "Abarrotes"),
        Producto(4,"Leche santa clara",R.drawable.prod4, "Abarrotes"),
        Producto(5,"Frijoles La Sierra",R.drawable.prod5, "Abarrotes"),
        Producto(6,"Arroz super extra",R.drawable.prod6, "Abarrotes"),
        Producto(7,"Manzana roja",R.drawable.prod7, "Frutas y Verduras")
    )

    fun getProducto(id: Int): Producto?=listaProductos.find { it.id==id }
}