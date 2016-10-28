package src.shapes;
/**
 * Created by catalina.serbu on 8/19/2016.
 */


public class ShapesDrawingTest {
    public static void main(String args[]){

        int noShapes = 0;
        Drawing draw = new Drawing(noShapes,null);

        Shape p = new Point(10,10);
        Shape c = new Circle(30,30,2);
        Shape r = new Rectangle(40,40,50,10);

        draw.addShape(p);
        draw.addShape(c);
        draw.addShape(r);

        draw.drawShapes();
    }
}


