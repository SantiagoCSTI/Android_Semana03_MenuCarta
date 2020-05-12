package com.example.menucarta.bean

import android.text.Editable

public class MenuCarta {
   var DetallePedido:String =""
   var Costo:Double=0.0
   var Cantidad:Double=0.0
   var Total:Double=0.0
   var Descuento:Double=0.0
   var CostoDelivery:Double=0.0
   var Delivery:Boolean=false
   var TotalPagar:Double=0.0

   constructor(pDetallePedido: String, pCosto:Double, pCantidad:Double, pDelivery: Boolean)
   {
       this.DetallePedido=pDetallePedido
       this.Costo = pCosto
       this.Cantidad = pCantidad
       this.Delivery = pDelivery
       this.Total = 0.0
       this.TotalPagar = 0.0
       this.Descuento = 0.0
       this.CostoDelivery = 0.0
   }

    public fun CalcularPago()
    {
        if (this.Delivery)
        {
            CostoDelivery = 20.0
        }
        Total= Costo * Cantidad
         if (Total>300)
         {
             Descuento = Total * 0.10
         }
        TotalPagar = (Total + CostoDelivery) - Descuento
    }


}