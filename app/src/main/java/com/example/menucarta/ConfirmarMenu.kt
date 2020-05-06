package com.example.menucarta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_confirmar_menu.*

class ConfirmarMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar_menu)

        edtDetalleImpresion.setText(intent.extras!!["DetallePedido"]!!.toString())
        edtCostoImpresion.setText(intent.extras!!["Costo"]!!.toString())
        edtCantidaImpresion.setText(intent.extras!!["Cantidad"]!!.toString())

        //edtDetalleImpresion
    }
}
