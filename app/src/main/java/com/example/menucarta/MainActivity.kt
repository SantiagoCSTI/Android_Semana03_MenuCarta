package com.example.menucarta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var Costo:Double = 0.0
    var Cantidad:Double = 0.0
    var Total:Double = 0.0
    var Descuento:Double = 0.0
    var CostoDelivery:Double = 0.0
    var TotalPagar:Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CalcularTotales(): Boolean
    {
        if (EdtCosto.text.isEmpty() || EdtCosto.text.equals("0") )
        {
            Toast.makeText(baseContext,"Por favor ingresar el costo",Toast.LENGTH_LONG).show()
            return false
        }

        if (EdtCantidad.text.isEmpty() || EdtCantidad.text.equals("0") )
        {
            Toast.makeText(baseContext,"Por favor ingresar la Cantidad",Toast.LENGTH_LONG).show()
            return false
        }

        Costo = EdtCosto.text.toString().toDouble()
        Cantidad = EdtCantidad.text.toString().toDouble()
        Total = Costo * Cantidad

        if (  Total > 300)
        {
            Descuento = Total * 0.10
        }
        if (chkDElivery.isChecked)
        {
            CostoDelivery = 20.0
        }
        TotalPagar = (Total - Descuento) + CostoDelivery
        return true;
    }

    public fun btnCalcularClick(v: View)
    {
        if (CalcularTotales())
        {
            //Mostrar los datos calculados
            EdtTotal.setText(Total.toString())
            EdtDescuento.setText(Descuento.toString())
            EdtTotalPagar.setText(TotalPagar.toString())
        }
    }

    public fun btnImprimir_OnClick(v: View)
    {
        if (CalcularTotales())
        {
            //Mostrar los datos calculados
            EdtTotal.setText(Total.toString())
            EdtDescuento.setText(Descuento.toString())
            EdtTotalPagar.setText(TotalPagar.toString())

            var oVentanaImprimir:Intent=Intent(this,ConfirmarMenu::class.java)
            oVentanaImprimir.putExtra("DetallePedido", EdtDetallePedido.text)
            oVentanaImprimir.putExtra("Costo", EdtCosto.text)
            oVentanaImprimir.putExtra("Cantidad", EdtCantidad.text)
            oVentanaImprimir.putExtra("Total", EdtTotal.text)
            oVentanaImprimir.putExtra("Descuento", EdtDescuento.text)
            oVentanaImprimir.putExtra("Delivery", CostoDelivery.toString())
            oVentanaImprimir.putExtra("TotalPagar", EdtTotalPagar.toString())
            startActivity(oVentanaImprimir)
        }

    }


    public fun btnCalcularClase_OnClick(v: View)
    {

            var oActivity:Intent=Intent(this,MenuCartaClase::class.java)
            startActivity(oActivity)

    }

}
