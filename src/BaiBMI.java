import java.util.Scanner;

public class BaiBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Your weight(in kilogram:)");
        weight= scanner.nextDouble();
        System.out.println("Your height(in meter ):");
        height = scanner.nextDouble();
        bmi= weight/Math.pow(height,2);
        System.out.println("%-20s%s");






    }
}
