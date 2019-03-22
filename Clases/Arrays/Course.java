import java.util.Scanner;

public class Course{
    //Declaracion pueden estar antes o despues Los corchetes on para saber que es un arreglo(edificio) 
    private  String courseName;
    private String[] students = new String [100];
    private int numberOfStudents;

    //constructor
    /*Course(String course){
        this.courseName = course; 
    } */
    public void addStudent(String student){
        //Variable nombreOfstu es para que no se inicialice en 0, se borren los datos y ponga nuevos 
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents() {
        return students;
    }
    //Retorna el numero de estudiantes 
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public static void main(String[] args) {
        Course cur1= new Course();
        Scanner scan = new Scanner(System.in);

        int opc=1;
        while (opc!=6){
            System.out.println("-------------------Elija una opcion---------------\n 1)Nombre del curso\n 2)Agregar estudiante\n 3)Mostrar estudiantes\n 4)Mostrar total de estudiantes\n 5)Eliminar estudiante\n 6)Salir");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Por favor ingrese nombre del curso");
                    cur1.courseName = scan.next();
                break;
                case 2:
                    System.out.println("Por favor ingrese el nombre");
                    String e = scan.next();
                    cur1.addStudent(e);
                break;
                case 3:
                    System.out.println(cur1.courseName);
                    for(int i=0; i < cur1.getNumberOfStudents(); i++){
                    System.out.println("Estudiante "+(i+1)+": "+cur1.students[i]);
                    }

                break;
                case 4:
                    System.out.println("Total de estudiantes = "+cur1.getNumberOfStudents() );
                break;
                case 5:
                    System.out.println("el estudiante que se eliminara");
                    String est = scan.next();
                    for(int i = 0; i< cur1.getNumberOfStudents(); i++){
                        if(est.equals(cur1.students[i])){
                            cur1.students[i] = "";
                        }
                    }
                break;
                default: System.out.println("Bye Bye");
                break;
            }
    }
    }
}