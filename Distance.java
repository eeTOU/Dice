
import java.util.Scanner;
public class Distance {

    public static void main(String[] args) {

        double x1, y1, x2, y2; // coordinates of two points
        double distance; // distance between the points
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        System.out.print ("Enter the coordinates of the first point " +
                "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.print ("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        // Compute the distance
        double first , second;
        first=Math.pow((x1-x2),2);
        second=Math.pow((y2-y1),2);
        distance=Math.sqrt(first +second);

        // Print out the answer
        System.out.println("Distance :"+ distance);

    }

}
