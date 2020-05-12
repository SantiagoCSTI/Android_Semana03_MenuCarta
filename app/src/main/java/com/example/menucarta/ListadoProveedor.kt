package com.example.menucarta

import android.R
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.example.menucarta.adaptador.AdaptadorProveedor
import com.example.menucarta.bean.ProveedorBean
import kotlinx.android.synthetic.main.activity_listado_proveedor.*


class ListadoProveedor : AppCompatActivity() {

    lateinit var oListaproveedor:ArrayList<ProveedorBean>
    lateinit var oAdaptadorProveedor: AdaptadorProveedor
   // lateinit var oDialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       //setContentView(R.layout.activity_listado_proveedor)

        oListaproveedor= ArrayList<ProveedorBean>()
        oListaproveedor.add(ProveedorBean(0,"1041009882","Cibertec SAC", "Av Izaguirre"))
        oListaproveedor.add(ProveedorBean(0,"3453453454","MEtro SAC", "Av Izaguirre"))

        oAdaptadorProveedor= AdaptadorProveedor(oListaproveedor.toList(), this)

        lvListaProveedor.adapter= oAdaptadorProveedor
    }

    public fun CargarVentanaDialogo(V:View)
    {
        /*oDialog=Dialog(this)
        oDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        oDialog.setCancelable(false)
        */
        //oDialog.setContentView(R.layout. R.layout.activity_nuevo_proveedor)
        //oDialog.findViewById(R.id.tvTitulo).text = "Por favor completa los datos del usuario"


    }



}

