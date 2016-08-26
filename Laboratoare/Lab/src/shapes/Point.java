package shapes;

/**
 * Created by catalina.serbu on 8/19/2016.
 */


class Point extends Shape{
    int x;
    int y;
    ShapeType st;// = shapes.ShapeType.POINT;

    public Point(int x,int y) {
        super(x, y);
        st = ShapeType.POINT;

    }
    @Override
    public void showCharacteristics()
    {
        super.showCharacteristics();
        System.out.println("Type of shape:"+this.st);
    }
}
