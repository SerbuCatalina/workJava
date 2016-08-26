package shapes;

/**
 * Created by catalina.serbu on 8/19/2016.
 */

class Circle extends Shape{
    int x;
    int y;

    int radius;
    ShapeType st;// = shapes.ShapeType.CIRCLE;

    public Circle(int x,int y,int radius) {
        super(x,y);
        this.radius = radius;
        st = ShapeType.CIRCLE;
    }

    public int getDiameter()
    {
        return 2*this.radius;
    }
    public int getCircumference()
    {
        return (int)(2*Math.PI*this.radius);
    }

    @Override
    public void showCharacteristics()
    {
        super.showCharacteristics();
        System.out.println("Type of shape:"+this.st+", diameter:"+getDiameter()+"; Circumference: "+getCircumference());
    }
}
