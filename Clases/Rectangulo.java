class Rectangulo{
    //Atributos
    double largo;
    double alto;

    //constructor **ahorra poner get y set** SOBRECARGA para tener más constructores pero tenemos que hacerlos con distintos parametros
    Rectangulo(){}

    Rectangulo(double alto){}

    Rectangulo(int largo){}

    Rectangulo(double alto,double largo){}
        this.alto = alto;
        this.largo = largo;

    //Metodos

    public double getLargo(){
        return largo;
    }

    public void setLargo(double largo){
        this.largo = largo;
    }

    public double getAlto(){
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea(){
        return largo * alto;
    }

    public static void main(String[] args){

        Rectangulo rec1 = new Rectangulo(10,20);

        //rec1.setAlto(10);
        //rec1.setLargo(20);
         
        System.out.println("El area es "+ rec1.calcularArea());

    }
}
