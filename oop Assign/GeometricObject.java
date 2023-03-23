public abstract class GeometricObject{ 
  
    
    boolean isFilled ;
    String color ;
    public GeometricObject(){ 

    }
    public GeometricObject(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }  
    public void setColor(String color) {
        this.color = color;
    } 
    public String getColor() {
        return color;
    }

    abstract public double getArea() ;
    
    abstract public double getperimeter() ;

    


}