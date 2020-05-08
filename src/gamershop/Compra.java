
package gamershop;

import javax.swing.JOptionPane;


class Compra extends Venta{
     private int EstadoEnvio;
     
     public Compra(int Eenvio){
         this.EstadoEnvio=Eenvio;
     }
     Compra(){
      EstadoEnvio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado del envio\n1. Enviado\n2. En curso"));
         switch(EstadoEnvio){
                case 1:
                    System.out.println("ESTADO DEL ENVIO: " + "Enviado");
                    break;
                case 2:
                    System.out.println("ESTADO DEL ENVIO: " + "En curso");
                    break;
            }
     
         System.out.println(EstadoEnvio);  
     }
}