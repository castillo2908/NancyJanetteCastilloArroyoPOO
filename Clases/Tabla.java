import java.util.Scanner;
class Tabla{
    public static void main(String[]arg)
    Scanner scanner = new scanner(System.in);
    int aux = 0;
    while (aux !=0){
        System.out.println("Cual tabla quieres ver: \n 1 \n 2 \n 3 \n 4 \n 5 \n 6 \n 7 \n 8 \n 9 \n 10 \n Salir  ");
        aux = scanner.nextInt();
        int cont = 1;
        switch (aux) {
            case 1:
                do {
                    int mul = cont * 1;
                    System.out.println("1 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);
                
                break;
            case 2:
                do {
                    int mul = cont * 2;
                    System.out.println("2 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);
                
                break;
            case 3:
                do {
                    int mul = cont * 3;
                    System.out.println("3 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);

                break;
            case 4:
                do {
                    int mul = cont * 4;
                    System.out.println("4 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);
                
                break;
            case 5:
                do {
                    int mul = cont * 5;
                    System.out.println("5 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);
                
                break;
            case 6:
                do {
                    int mul = cont * 6;
                    System.out.println("6 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);
                
                break;
            case 7:
                do {
                    int mul = cont * 7;
                    System.out.println("7 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);
                
                break;
            case 8:
                do {
                    int mul = cont * 8;
                    System.out.println("8 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);
                
                break;
            case 9:
                do {
                    int mul = cont * 9;
                    System.out.println("9 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);
                
                break;
            case 10:
                do {
                    int mul = cont * 10;
                    System.out.println("10 x" + cont "=" mul);
                    cont ++;
                    
                } while (cont == 10);
                
                break;

            default:
                System.out.println("Bye Bye");
                break;
        }
    }
}