import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of a triangle: ");
        System.out.print("Side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Side 3: ");
        int side3 = sc.nextInt();

        try {
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1
            && side1 > 0 && side2 > 0 && side3 > 0) {
                System.out.println("Is a triangle");
            }
            else {
                throw new Exception("Not a triangle");
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
