package extra;
import java.util.*;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.println("The area of the circle with radius "+ radius +" is "+ area);
	}

}
