import java.util.Scanner;
class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a=sc.nextInt();
        System.out.print("Input second number: ");
        int b=sc.nextInt();
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" x "+b+" = "+(a*b));
        if(b==0)
            {
                System.out.println("Division and remainder are undefined for zero.");
            } 
        else{
        System.out.println(a+" / "+b+" = "+(a/b));
        System.out.println(a+" mod "+b+" = "+(a%b));
        }
    }
}
