import java.util.Scanner;
class IntegerCube {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        for(int i=1; i<=num; i++){
            int cube = i * i * i;
            System.out.println("Number is : "+i+" and cube of " + i + " is: " + cube);
        }
    }
    
}
