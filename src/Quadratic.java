import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        System.out.print("Enter a, b, c: ");
        Scanner quadInput = new Scanner(System.in);
        double a = quadInput.nextDouble();
        double b = quadInput.nextDouble();
        double c = quadInput.nextDouble();

        double checkValid = Math.pow(b,2) - (4 * a * c);

        if (checkValid>= 0){
            double squareRoot = Math.sqrt(checkValid);
            double r1 = ((-b + squareRoot)/2*a);
            double r2 = ((-b - squareRoot)/2*a);
            if (checkValid >0.0){
                System.out.println("There are two roots for the quadratic equation with these coefficients.");
                System.out.println("r1 ="+r1);
                System.out.println("r2 ="+r2);
        } else if (checkValid == 0.0) {
                System.out.println("There is one root for the quadratic equation with these coefficients.");
                System.out.println("r1 ="+r1);
            }
        } else if (checkValid < 0.0) {
            System.out.println("There are no roots for the quadratic equation with these coefficients.");
        }
    }
}