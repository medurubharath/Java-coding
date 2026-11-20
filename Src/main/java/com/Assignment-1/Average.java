import java.util.Scanner;
class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input first number: ");
        double a=sc.nextDouble();
        System.out.print("Input second number: ");
        double b=sc.nextDouble();
        System.out.print("Input third number: ");
        double c=sc.nextDouble();
        System.out.println("Average = " + ((a+b+c)/3));
    }
}
