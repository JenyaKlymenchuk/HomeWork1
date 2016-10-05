package HomeWork1;

/**
 * Created by klimenchukev on 04.10.2016.
 */
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int square(){
        return width * height;
    }

    public int perimetr(){
        return 2 * (width + height);
    }
}
