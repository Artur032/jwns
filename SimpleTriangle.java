public class SimpleTriangle  extends GeometricObject  {
    public SimpleTriangle (Vertex pos, double width) {
        super (pos, width, (Math.sqrt(3) / 2) * width);
       
    }
 
    @Override public String toString () {
        return "SimpleTriangle" + super.toString();
    }
 
    public double circumference () {
        return 3 * width;
    }  
   
    public double area () {
        return 1 / 2 * width * heigth;
    }
 
}