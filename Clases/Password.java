import java.util.Scanner;

public class Password {

    //Atributo

    private int longitud; 
    private String password;

    //Metodos

    public int getLogitud(){
        return longitud;  
    }
    public void setPassword(String pass){
        this.password = pass;

    }
    public boolean esFuerte(){
        if (password.length()  < 8){
            return false;
        } else
            return true;
            
    }   

    public void setPassword(String pass){
        this.password = pass;

         p1.setPassword("holis");
         if (p1.esFuerte() == true){
             System.out.println("Contraseña fuerte");
         }else{
             System.out.println("Contraseña invalida");
         }
    }
}