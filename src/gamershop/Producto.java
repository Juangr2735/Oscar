package gamershop;

import javax.swing.JOptionPane;


class Producto {
    private String Nombre;
    private double Precio;
    private String Descripcion;
   
 public Producto(String nombre,double precio,String descripcion){
     this.Nombre=nombre;
     this.Precio=precio;
     this.Descripcion=descripcion;
 }
 Producto(){
 }
 public void MostrarProducto(){
     Nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
     Precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
     Descripcion=JOptionPane.showInputDialog("Ingrese una breve descripcion del producto");
       System.out.println("NOMBRE PRODUCTO: " + Nombre);
       System.out.println("PRECIO: " + Precio);
       System.out.println("DESCRIPCION: " + Descripcion);
 }
}