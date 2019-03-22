import java.util.*;

public class Palabra{
    private String word;
    
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public int contarLetras(){
        return word.length();
    }
    public static void main(String[] args) {
        
        Palabra p1 = new Palabra();
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Por favor ingrese una palabra");
        String palabra = scanner.next();
        p1.setWord(palabra);
        System.out.println("Numero de letras que tiene tu palabra: "+ p1.getWord()+ "es: " +p1.contarLetras());
    }
}