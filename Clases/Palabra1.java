import java.util.Scanner;
public class Palabra1{

    //Atributos 
    
    private String word;

    //Metodos

    public String getWord(){
        return word;
    }

    public void setWord(String word){
        this.word = word;

    }
    
     public int contarLetras(){
         return word.length();
     }
     public static void main(String[] args){

         Palabra1 p = new Palabra1();
         Scanner scanner = new Scanner(System.in);

         System.out.println("Escriba una palabra");
         String pal = scanner.next();
         p.setWord(pal);
        System.out.println("La palabra " + p.getWord()+  "tiene " + p.contarLetras());
    }

}