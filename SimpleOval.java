public class SimpleOval extends GeometricObject{
    public SimpleOval (Vertex pos, double width, double height) {
        super(pos, width, height);


    }

    public toString () {
        return "SimpleOval" +super.toString();
    }

    public SimpleOval (double x, double y, double width, double height) {
        super(new Vertex(x,y), width, height); 

    }
}
