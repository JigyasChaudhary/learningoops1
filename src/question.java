import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int x = s.nextInt();
        System.out.println("enter the number");
        int y = s.nextInt();
         if(x>y) {
             System.out.println("print number"+x);
         }
        else{
             System.out.println("print number"+y);
         }
    }
}
