package HomeWork1;

/**
 * Created by klimenchukev on 05.10.2016.
 */
public class RectangleRunnner {
    public static void main(String[] args) {

        // make list of rectangles
        Rectangle[] list = {new Rectangle(3, 5), new Rectangle(7, 8), new Rectangle(5, 3)};
        summarySquare(list);
    }

        //static method for getting summary square
        public static int summarySquare(Rectangle[] list){
        int square = 0;
        for(int i = 0; i < list.length; i++){
            square += list[i].square();
        }
            return square;

    }
}
