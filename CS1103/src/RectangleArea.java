
/**
 * 
 * @author Alejandro Trujillo
 *
 *Class used to calculate the area of a rectangle.
 *This class is used to exemplify catching and handling exceptions.
 *User will provide the radius desired. 
 */
import java.util.*;
public class RectangleArea {
	
	static Scanner rect = new Scanner(System.in);
	
	public static void main( String args[]) {
		
		System.out.print("Enter the length of your rectangle: ");
		double length = rect.nextDouble();
		
		System.out.print("Enter the width of your rectangle: ");
		double width = rect.nextDouble();
		
		double area = ( length * width );
		System.out.println("The area of your rectangle is: " + area);
	}
}

	
