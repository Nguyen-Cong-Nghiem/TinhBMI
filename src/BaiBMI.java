import java.util.Scanner;

public class BaiBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Your weight(in kilogram):");
        weight= scanner.nextDouble();
        System.out.println("Your height(in meter ):");
        height = scanner.nextDouble();
        bmi= weight/Math.pow(height,2);
        if(bmi<18)
            System.out.printf("%-20f%s",bmi,"Underweight");
        else if(bmi<25)
            System.out.printf("%-20f%s",bmi,"Normal");
        else if(bmi<30)
            System.out.printf("%-20f%s",bmi,"Overweight");
        else
            System.out.printf("%-20f%s",bmi,"Obese");






    }
}
