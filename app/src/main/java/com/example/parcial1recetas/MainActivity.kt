package com.example.parcial1recetas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvRecetas: RecyclerView
    private lateinit var adapter: RecetaAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvRecetas = findViewById(R.id.rv_recetas)
        rvRecetas.layoutManager = LinearLayoutManager( this)
        adapter = RecetaAdapter( this)
        rvRecetas.adapter = adapter

        val listaRecetas = getListadoRecetas()
        adapter.submitList(listaRecetas)

    }

    private fun getListadoRecetas(): MutableList<Receta> {
        return mutableListOf(
            Receta(
                1,
                 "Milanesa Napolitana",
                "Argentina",
                "Baja",
                listOf("Milanesa, Tomate, Queso, Jamon, Tuco, Papas"),
                null
                //"https://www.lanacion.com.ar/resizer/v2/milanesa-a-la-napolitana-con-guarnicion-de-papas-VLWFAANIWBGPFO4CSUHS7RYVVQ.jpg?auth=335fda04cf2733e39d11ca0ba979c1d0a8a55e6cdec15e4d5b00cfd59fbf9ed8&width=880&height=586&quality=70&smart=true"
                //"/res/drawable/milanesa.pgn"
            ),
            Receta(
                2,
                "Feijoada",
                "Brasil",
                "Alta",
                listOf("Frijoles Negros", "Carne de cerdo", "Arroz", "Harina de mandioca"),
                "/res/drawable/feijoada.png"
            ),
            Receta(
                3,
                "Salteñas",
                "Bolivia",
                "Media",
                listOf("Gelatina", "Relleno a gusto", "chile", "papas", "cebollas", "aceitunas", "huevo", "guisantes", "comino", "orégano" , "azúcar"),
                "/res/drawable/saltenias.jpg"
            ),
            Receta(
                4,
                "Pastel de choclo",
                "Chile",
                "Dificil",
                listOf(" relleno de carne molida con cebolla", "aceite de oliva", "ajo", "comino", "orégano", "granos de maíz", "crema de maíz"),
                "/res/drawable/pasteldechoclo.png"
            ),
            Receta(
                5,
                "Bandeja paisa",
                "Colombia",
                "Facil",
                listOf( "frijoles", "arroz", "salchicha", "huevo", "plátanos", "aguacate" , "panceta de cerdo frita"),
                "/res/drawable/bandejapaisa.jpg"
            ),
            Receta(
                6,
                "Vori Vori",
                "Paraguay",
                "Media",
                listOf( "caldo con pequeñas bolas de harina de maíz y queso"),
                "/res/drawable/vorivori.jpg"
            ),
            Receta(
                7,
                "Gallo pinto",
                "Costa Rica",
                "Dificil",
                listOf( "arroz", "frijoles", "salsa de condimentos"),
                "/res/drawable/gallopinto.jpg"
            ),
            Receta(
                8,
                "Ropa vieja",
                "Cuba",
                "Media",
                listOf( "Carne de res", "tomates", "cebollas caramelizadas", "pimientos" , "especias"),
                "/res/drawable/ropavieja.jpg"
            ),
            Receta(
                9,
                "Mole",
                "Mexico",
                "Dificil",
                listOf( "Caldo de pollo", "chiles" , "chocolate", "chocolate", "picante" , "dulzura", "especias" ,"hierbas"),
                "/res/drawable/mole.png"
            ),
            Receta(
                10,
                "Sancocho",
                "Panama",
                "Facil",
                listOf("Pollo"," trozos grandes de maíz" , "rodajas de raíz de yuca"),
                "/res/drawable/sancocho.png"
            ),
        )
    }
}