package com.example.menucarta.adaptador

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.menucarta.bean.Alumno
import com.example.menucarta.R

class AdaptadorAlumno(val ListaInterna:List<Alumno>, Contexto: Context) : RecyclerView.Adapter<AdaptadorAlumno.AlumnoHolder>()
{
    public class AlumnoHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bindItems(oAlumno: Alumno) {
            val tvDni = itemView.findViewById(R.id.tvITEM_DNIALUMNO) as TextView
            val tvNombres = itemView.findViewById(R.id.tvITEM_NOMBRESALUMNO) as TextView
            tvDni.text = oAlumno.DNI
            tvNombres.text = oAlumno.Nombres
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AlumnoHolder, position: Int) {
        TODO("Not yet implemented")
    }

}