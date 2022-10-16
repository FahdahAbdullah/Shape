package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length; 
    private int breadth; 
    
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    
    public int getArea() { 
        int area= length*breadth;
        return area; //  code to calculate area here
    } 
    
    //  code to calculate perimeter here
    int getPerimeter() {
	int perimeter = 2 * (length + breadth);
        //Return Rectangle perimeter.
        return  perimeter;
}

    
    
}