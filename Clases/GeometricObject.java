import java.util.Date;
public class GeometricObject{

//Atributos
    private String color;
    private boolean filled;
    private Date dateCreated;

    //Constructor 
    public GeometricObject(){}
    public GeometricObject(String color,boolean filled){
        this.filled = filled;
        this.color = color;
    }

    //Metodos
        public String getColor() {
            return color;
        }
        
        public void setColor(String color) {
            this.color = color;
        }
        public boolean getFilled() {
			return filled;
		}

		public void setFilled(boolean filled) {
			this.filled = filled;
		}
       
        public Boolean isFilled() {  
            
            return  false;  
        }
        
        public Date getDateCreated(){
            Date Fecha =new Date();
            return Fecha;
        }
        
        public String toString(){
            return "Color: "+color+
                                "\nFilled: "+filled;

        }

        public static void main(String[] args){
            Circle1 cir1 = new Circle1();
            Circle1 cir2 = new Circle1(23.5);
            Circle1 cir3 = new Circle1(23.5,"Blue",true);

            Rectangle1 rec1 = new Rectangle1();
            Rectangle1 rec2 = new Rectangle1(23.5,30.5);
            Rectangle1 rec3 = new Rectangle1(23.5,30.5, "Red", false);
        }
    }