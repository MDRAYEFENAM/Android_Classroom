import java.util.Scanner;

public class odd_even_while_loop {

        public static void main(String[] args) {
            System.out.println("Enter your range of number:");
            Scanner input = new Scanner(System.in);
            int count = 0;
            int n = input.nextInt();
            int i = 1;
            while(i <= n)
            {
                if(i%2==0){
                    System.out.println(""+i);
                    count++;
                }
                i++;
            }

            System.out.println("Total number of even:"+count);
        }
    }
