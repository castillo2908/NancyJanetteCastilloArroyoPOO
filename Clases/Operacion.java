import java.util.Scanner;
public class Operacion{
    //Atributos
    private float a;
    private float b;

    //Metodo

    public void setA(float a){
        this.a = a; 
    }
    public void setB(float b){
        this.b = b;
    }
    public float hacerSuma(){
        return a+b;
    }
    public float hacerResta(){
        return a-b;
    }
    public float hacerMultiplicacion(){
        return a*b;
    }
    public float hacerDivision(){
        return a/b;
    }
    public static void main (String[]arg){
        Operacion oper1 = new Operacion();
        Scanner scanner = new Scanner(System.in);

        int oper = 0;
        

        while (oper != 6 ){
            System.out.println("1)Lea 2)Sumar 3)Restar 4)Multiplicar 5)Dividir 6)salir");
            oper = scanner.nextInt();

       switch (oper){
           case 1:
           System.out.println("Ingresa dos numeros");
           float a = scanner.nextFloat();
           float b = scanner.nextFloat();
           oper1.setA(a);
           oper1.setB(b);
           break; 
           
           case 2:
           System.out.println("El resultado de la suma es: " + oper1.hacerSuma());
           break;
           
           case 3:
           System.out.println("El resultado de la resta es: " + oper1.hacerResta());
           break;
           
           case 4:
           System.out.println("El resultado de la multiplicacion es: " + oper1.hacerMultiplicacion());
           break;
           
           case 5:
           System.out.println("El resultado de la division es: " + oper1.hacerDivision());
           break;
           
           default:
           System.out.println("BYE BYE");
           break;

       }
       } 
    }
}