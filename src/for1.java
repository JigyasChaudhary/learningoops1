import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("enter the number");
            sum = sum + s.nextInt();
        }
        System.out.println("sum is"+sum);
    }
}