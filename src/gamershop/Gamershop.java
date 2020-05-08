
package gamershop;

public class Gamershop {

 
  public static void main(String[] args) {
          System.out.println("INFORMACION CLIENTE");
      Usuario cliente1;
        cliente1 = new Usuario();
            cliente1.MostrarUsuario();
             System.out.println("INFORMACION VENTA");
      Venta venta1;
        venta1 = new Venta();
            venta1.MostrarVenta();
             System.out.println("INFORMACION PRODUCTO");
           Producto p1;
           p1 = new Producto();
            p1.MostrarProducto();
          System.out.println("JOSE es gai");
    }
   
}
