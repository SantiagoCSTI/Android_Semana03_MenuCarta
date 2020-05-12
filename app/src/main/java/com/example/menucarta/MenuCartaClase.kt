package com.example.menucarta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.menucarta.bean.MenuCarta
import kotlinx.android.synthetic.main.activity_menu_carta_clase.*

class MenuCartaClase : AppCompatActivity() {

    lateinit var oMenuCarta: MenuCarta

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_carta_clase)
    }

    fun CalcularPago():Boolean
    {
        if (EdtCostoCL.text.isEmpty() || EdtCostoCL.text.equals("0") )
        {
            Toast.makeText(baseContext,"Por favor ingresar el costo",Toast.LENGTH_LONG).show()
            return false
        }
        if (EdtCantidadCL.text.isEmpty() || EdtCantidadCL.text.equals("0") )
        {
            Toast.makeText(baseContext,"Por favor ingresar la Cantidad",Toast.LENGTH_LONG).show()
            return false
        }
        oMenuCarta = MenuCarta(
            this.EdtDetallePedidoCL.text.toString(),
            this.EdtCostoCL.text.toString().toDouble(),
            this.EdtCantidadCL.text.toString().toDouble(),
            this.chkDEliveryCL.isChecked
        )
        oMenuCarta.CalcularPago()
        return true
    }

    public fun btnCalcularOnclic(v:View)
    {
        if (CalcularPago())
        {
            this.EdtTotalCL.setText(oMenuCarta.Total.toString())
            this.EdtDescuentoCL.setText(oMenuCarta.Descuento.toString())
            this.EdtTotalPagarCL.setText(oMenuCarta.TotalPagar.toString())
        }

    }


}
