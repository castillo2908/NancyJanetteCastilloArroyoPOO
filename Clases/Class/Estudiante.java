public class Estudiante extends Persona{
    //Atributos 
    private int matricula;

    //Constructor 
    public Persona(){}
    public Persona(int matricula){}
    public Persona(int matricula, String nombre, int edad, String sexo){
        super(nombre,edad,sexo);
        this.matricula = matricula;
    }
    //Metodo
    public double getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}