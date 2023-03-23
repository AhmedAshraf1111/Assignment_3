
public class Triangle extends GeometricObject { 

    
   private double side1 ;
   private  double side2 ;
   private double side3 ; 

    public Triangle(){ 

    }
    public Triangle(double size1,double size2,double size3,boolean isFilled,String color){ 
        super(isFilled,color);
        this.side1=size1;
        this.side1=size2;
        this.side1=size3; 
    }
    

    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    @Override
    public double getArea() {
        
        double s= getperimeter()/2 ;
        double A= Math.sqrt(s*((s-side1)*(s-side2)*(s-side3))) ;
        return A;
    }

    @Override
    public double getperimeter() { 

        double per=side1+side2+side3 ;
        
        return per;
    }

    
}