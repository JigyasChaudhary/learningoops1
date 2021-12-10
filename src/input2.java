import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z= x+y;
        int p=x*y;
        System.out.println("sum:"+z+"\nproduct : "+p);
    }
}
