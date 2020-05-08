package gamershop;

import javax.swing.JOptionPane;


class Usuario {
    private String Nombre;
    private String Documento;
    private String Telefono;
   
    public Usuario (String nom, String doc, String tel){
        this.Nombre=nom;
        this.Documento=doc;
        this.Telefono=tel;
    }
    Usuario(){
    }

   public void MostrarUsuario() {
        Nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        Documento=JOptionPane.showInputDialog("Ingrese su documento");
        Telefono=JOptionPane.showInputDialog("Ingrese su telefono");
        System.out.println("CLIENTE: " + Nombre);
        System.out.println("DOCUMENTO: " + Documento);
        System.out.println("TELEFONO: " + Telefono);
       
    }
   
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nom){
        this.Nombre=nom;
    }
    public String getDocumento(){
        return Documento;
    }
    public void setDocumento(String doc){
        this.Documento=doc;
    }
    public String getTelefono(){
        return Telefono;
    }
    public void setTelefono(String tel){
        this.Telefono=tel;
    }

}

