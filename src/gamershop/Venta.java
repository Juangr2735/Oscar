package gamershop;

import javax.swing.JOptionPane;


class Venta {
    private long Id_Venta;
    private String Fecha;
    private int FormaPago;
   
    public Venta(long id,String fecha,int pago){
        this.Id_Venta=id;
        this.Fecha=fecha;
        this.FormaPago=pago;
    }
   
    Venta(){
    }
    public void MostrarVenta(){
        Id_Venta=Long.parseLong(JOptionPane.showInputDialog("Ingrese el ID de la venta"));
        Fecha=JOptionPane.showInputDialog("Ingrese la fecha de la venta");
        FormaPago=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la forma de pago\n1. Efectivo\n2. Tarjeta de Credito"));
        System.out.println("Id_Venta: " + Id_Venta);
        System.out.println("FECHA: " + Fecha);
            switch(FormaPago){
                case 1:
                    System.out.println("FORMA DE PAGO: " + "Efectivo");
                    break;
                case 2:
                    System.out.println("FORMA DE PAGO: " + "Tarjeta de Credito");
                    break;
            }
         
    }
}
