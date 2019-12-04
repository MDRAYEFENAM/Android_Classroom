import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        System.out.println("Enter your range of number:");
        Scanner input = new Scanner(System.in);
        int count = 0;
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                count++;
                System.out.println(""+i);
             }
        }
        System.out.println("Total number of even:"+count);
    }
}
