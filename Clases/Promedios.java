import java.util.*;
public class Promedios{


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas calificaciones quieres almacenar?");
        int cal = scanner.nextInt();

        double[]prome;
        prome = new double[cal];
        double contador = 0;

		for (int i = 0; i < prome.length; i++) {
            System.out.print("Pon tu calificacion: " + (i+1) + " :");
            prome[i] = scanner.nextInt();   
        }

        for (int i = 0; i<cal; i++){
            contador = contador + prome[i]; 
        }
        System.out.println("Promedio :"+contador/cal);
        
    }
}