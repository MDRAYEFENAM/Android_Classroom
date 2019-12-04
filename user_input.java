import java.util.Scanner;

public class user_input {
        public static void main(String[] args) {

            Scanner obj=new Scanner(System.in);// create scanner object

            System.out.print("Enter the first number: ");
            int num1=obj.nextInt();//this method reads value for num1

            System.out.print("Enter the second number: ");
            int num2=obj.nextInt();//this method reads value for num2

            obj.close();     //closing the scanner class

            sumNum(num1,num2);  //calling the method
        }

        //sum method
    public static void sumNum(int num_A,int num_B){
        int sum=0;
        sum=num_A+num_B;
        System.out.println("Sum of two numbers  "+sum);
    }
}
