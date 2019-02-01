import java.util.Scanner;

public class Estudiante{

    //Atributos
    public String nombre;
    public int annioNac;
    public int ANNIOACTUAL = 2019;

    //Metodos

    public int calcularEdad(){
        
        return (ANNIOACTUAL-annioNac);
    }
    public void imprimirInformacion(String nombre){
        System.out.println("Hola "+nombre+" tu edad es: "+calcularEdad()+" años");
        
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre");
        studiante.nombre = scanner.next();  
        
        System.out.println("Escribe tu año de nacimiento");
        estudiante.annioNac = scanner.nextInt();
        
        estudiante.imprimirInformacion(studiante.nombre);
        
    }   
}   

