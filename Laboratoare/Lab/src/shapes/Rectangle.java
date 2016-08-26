package shapes;

/**
 * Created by catalina.serbu on 8/19/2016.
 */
class Rectangle extends Shape{
    int x;
    int y;

    int width;
    int height;

    ShapeType st;// = shapes.ShapeType.RECTANGLE;
    public Rectangle(int x,int y,int width,int height) {
        super(x,y);

        this.width = width;
        this.height = height;
        st = ShapeType.RECTANGLE;
    }

    public int getParameter()
    {
        return 2*this.width+2*this.height;
    }

    public int getArea(){
        return this.width+this.height;
    }

    @Override
    public void showCharacteristics()
    {
        super.showCharacteristics();
        System.out.println("Type of shape:"+this.st+", parameter:"+getParameter()+"; area: "+getArea());
    }
}
