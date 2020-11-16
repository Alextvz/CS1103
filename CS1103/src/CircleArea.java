
/**
 * 
 * @author Alejandro Trujillo
 *
 *Class used to calculate the area of a circle.
 *This class is used to exemplify catching and handling exceptions.
 *User will provide the radius desired. 
 */
import java.util.*;
public class CircleArea {
	
	static Scanner rad = new Scanner(System.in);
	
	public static void main( String args[]) {
		
		System.out.print("Enter the radius of your circle: ");
		double radius = rad.nextDouble();
		
		double area = Math.PI * ( radius * radius );
		System.out.println("The area of your circle is: " + area);
	}

	

}
