import java.util.Scanner;

public class Exercise1 {
    // [Thực hành] Debug ứng dụng Java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Linear Equation Solver ===");
        System.out.println("Give an equation as 'ax + b = 0', please enter the value of: ");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("Solution is x = " + x);
        } else {
            if (b == 0) {
                System.out.println("Solution is x = 0");
            } else {
                System.out.println("No solution");
            }
        }
    }
}
