public class Circle1 extends GeometricObject{
    //Extends es herencia 
    //Atributo
    private double radius;
    //Constructor 
        public Circle1(){}
        public Circle1(double radius){}
        public Circle1(double radius,String color,boolean filled){
            super(color,filled);
            this.radius = radius;
            
           
        }
    //Metodo
     public double getRadius() {
            return radius;
        }
    
    
        public void setRadius(double radius) {
            this.radius = radius;
        }
    
    
        public double getArea () {  
            return  (Math.PI * Math.pow((radius),2));  
        }
        public double getPerimeter(){
           return (2 * Math.PI * (radius));}
        public double getDiameter(){
           return (radius*2);}
    
        public void printCircle(){
    
             System.out.println("Area: "+getArea()+" cm2"+
                        "\nPerimetro: "+getPerimeter()+" cm"+
                        "\nDiametro: " +getDiameter()+" cm");
                        
        }
}
    
    