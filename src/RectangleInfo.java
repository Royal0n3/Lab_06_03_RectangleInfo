import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args) {
        int L = 0;
        int W = 0;
        int perimeter;
        int area;
        int lengthofDiagonal;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        if (in.hasNextInt()) {
            L = in.nextInt();
        } else {
            System.out.println("Error input correct value");
            System.exit(0);

        }
        System.out.println("Enter width of rectangle");
        if (in.hasNextInt()) {

            W = in.nextInt();
        } else {
            System.out.println("Error input correct value");
            System.exit(0);
        }
        area = L * W;
        perimeter = 2*(L*W);
        lengthofDiagonal = (W*W)+(L*L);
        System.out.println("The area of the rectangle is "+area);
        System.out.println("The perimeter of the rectangle is "+perimeter);
        System.out.println("The rectangles length of the diagonal is "+lengthofDiagonal);


        


    }}