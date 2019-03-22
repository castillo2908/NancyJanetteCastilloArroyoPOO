import java.util.Date;
public class Persona{

    //Atributos 
    private String nombre;
    private int edad;
    private String sexo; 
    private Date dateCreate;

    //Constructor 
    public Persona(){}
    public Persona(String nombre,int edad, String sexo ){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    //Metodo
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Date getDateCreated(){
        Date Utt =new Date();
        return Utt;
    }


    public static void main(String[] args){
        Estudiante utt1 = new Estudiante();
        Estudiante utt2 = new Estudiante(3518110002);
        Estudiante utt3 = new Estudiante(3518110002, "Nancy", 18, "Femenino");

        Profesor utt1 = new Profesor();
        Profesor utt2 = new Profesor(029);
        Profesor utt3 = new Profesor(029, "Juan", 32, "Masculino");
    }
}