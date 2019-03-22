class Cadenas {

    public static void main(String[] args) {
        //"   B u r i e d   T r e a s u r e   C h e s t ! " 
        //0 1 2 3 4 5 6 7 8 9 10111213141516171819202122232425"
        //Los espacios cuentan 
        String pirateMessage = "  Buried Treasure Chest! ";
        //charAt(int index)
        //Extraer la letra con su numero 

        //9 10 11 13
        System.out.print(pirateMessage.charAt(9));
        System.out.print(pirateMessage.charAt(10));
        System.out.print(pirateMessage.charAt(11));
        System.out.print(pirateMessage.charAt(13));

        //indexOf(int ch)
        //Posición de la letra
        System.out.println("----------.indexOf()--------");
        System.out.println(pirateMessage.indexOf('i'));
        System.out.println(pirateMessage.indexOf('e'));
        System.out.println(pirateMessage.indexOf("sure"));

        //length()
        //Da el numero de caracteres en este caso es 25 ya que son el numero de letras
        System.out.println(pirateMessage.length());
    }
}