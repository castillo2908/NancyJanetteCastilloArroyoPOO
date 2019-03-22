public class Profesor extends Persona{
    
    //Atributos 
    private int noDoc;

    //Constructor 
    public Profesor(){}
    public Profesor(int noDoc){}
    public Profesor(int noDoc,String nombre,int edad, String sexo){
        super(nombre,edad,sexo);
        this.noDoc = noDoc;
    }
    //Metodo
    public double getNoDoc() {
        return noDoc;
    }
    
    public void setNoDoc(int noDoc) {
        this.noDoc = noDoc;
    }
}