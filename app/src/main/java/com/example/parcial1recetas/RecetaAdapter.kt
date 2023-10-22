package com.example.parcial1recetas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlin.math.log

class RecetaAdapter(val context: Context) : ListAdapter<Receta, RecetaAdapter.RecetaViewHolder>(DiffCallBack) {
    //lateinit var onItemClickListener: (Receta) -> Unit
    inner class RecetaViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val nombreRecetaTextView: TextView = view.findViewById(R.id.nombre)
        private val dificultadTextView: TextView = view.findViewById(R.id.dificultad)
        private val origenPaisTextView: TextView = view.findViewById(R.id.origen)
        private val imagenReceta: ImageView = view.findViewById(R.id.imagen_receta)
        private val ingredientesTextView: TextView = view.findViewById(R.id.ingredientes)

        fun bind(receta: Receta) {
            nombreRecetaTextView.text = receta.nombre
            dificultadTextView.text = "Dificultad: ${receta.dificultad}"
            origenPaisTextView.text = "Origen: ${receta.origen}"
            ingredientesTextView.text = "Ingredientes: ${receta.ingredientes}"

            Glide.with(context)
                .load(receta.imagenReceta)
                .into(imagenReceta)

                val imagen = when (receta.nombre) {

                "Milanesa Napolitana" -> "https://www.lanacion.com.ar/resizer/v2/milanesa-a-la-napolitana-con-guarnicion-de-papas-VLWFAANIWBGPFO4CSUHS7RYVVQ.jpg?auth=335fda04cf2733e39d11ca0ba979c1d0a8a55e6cdec15e4d5b00cfd59fbf9ed8&width=880&height=586&quality=70&smart=true"
                  "Feijoada" -> "https://tse4.mm.bing.net/th?id=OIP.gwn-LATXa0eIYCJhEe0LqwHaE8&pid=Api&P=0&h=180"
                 "Salteñas" -> "https://i1.wp.com/laumalbec.com/wp-content/uploads/2016/03/2550b-saltencc83a.jpg?ssl=1"
                 "Pastel de choclo" -> "https://milrecetas.net/wp-content/uploads/2017/05/pastel-de-choclo-3.jpg"
                  "Bandeja paisa" -> "https://blog.amigofoods.com/wp-content/uploads/2019/06/colombias-bandeja-paisa.jpg"
                  "Vori Vori" -> "https://micorazondearroz.com/wp-content/uploads/2020/09/DSC09764-3.jpg"
                  "Gallo pinto" -> "https://www.healthylunchideas.net/assets/orignalimages/gallo-pinto.png"
                "Ropa vieja" -> "https://familiakitchen.com/wp-content/uploads/2021/03/Plated-ropa-vieja-2048x1489.jpg"
                "Mole" -> "https://i.pinimg.com/originals/52/b0/fa/52b0faff781e98f2d8f656d59ecfd04e.jpg"
                  "Sancocho" -> "https://www.thepetitgourmet.com/wp-content/uploads/2014/11/DSCN5439.jpg"
                    else -> ""
                 }



                    Glide.with(context).load(imagen).into(imagenReceta)
           // }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetaViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return RecetaViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecetaViewHolder, position: Int) {
        val receta = getItem(position)
        holder.bind(receta)
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<Receta>() {
        override fun areItemsTheSame(oldItem: Receta, newItem: Receta): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Receta, newItem: Receta): Boolean {
            return oldItem == newItem
        }
    }
}
