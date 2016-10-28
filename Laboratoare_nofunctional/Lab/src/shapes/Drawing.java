package shapes;

import shapes.Shape;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by catalina.serbu on 8/19/2016.
 */

class Drawing{

    List<Shape> shapeList = new ArrayList<Shape>();

    int noShapes;

    public Drawing(int noShapes,Shape[] shapes) {
        this.noShapes = noShapes;

        for(int i=0;i<noShapes;i++){
            this.shapeList.add(shapes[i]);
        }

    }

    public void addShape(Shape newShape)
    {
        this.noShapes++;
        this.shapeList.add(newShape);
    }

    public void drawShapes(){
        for(Shape s : this.shapeList)
        {
            s.showCharacteristics();
        }
    }
}