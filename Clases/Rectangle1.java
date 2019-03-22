public class Rectangle1 extends GeometricObject{
//Atributos
    private double width;
    private double height;
    //Constructor 
    public Rectangle1(){}
    public Rectangle1(double width,double height){}
    public Rectangle1(double width,double height, String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
       
    }
    //Metodo
        public double getWidth() {
            return width;
        }
        
        public void setWidth(double width) {
            this.width = width;
        }
        public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}
       
    
        public double getArea() {  
            return  (width*height);  
        }
        public double getPerimeter(){
           return ((height+width)*2);
        }
    
    

    }