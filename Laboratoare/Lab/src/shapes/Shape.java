package src.shapes;

import src.shapes.ShapeType;

class Shape{
    int x = 0;
    int y = 0;
    ShapeType st;

    public Shape(int x,int y){
        this.x = x;
        this.y = y;
        st = ShapeType.GENERIC;
    }

    public Shape(Shape another){
        this.x = another.x;
        this.y = another.y;
    }
    public void showCharacteristics(){
        System.out.println("coordinates:("+this.x+","+this.y+")");
    }

}