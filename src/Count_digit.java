import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number (count): "); // get input from the user
        int num=sc.nextInt();
        int count=0; // actual count before the condition part work
        int temp_num=num;
        if(temp_num==0){ // if the give number is zero  the actual count is 1
            count=1;
        }while(temp_num!=0){  // if the give number one or more then the condition part will be work
            temp_num=temp_num/10;  // remove last digit and store the remaining values in temp_num.
            count++;   // if the condition will be true increase the count one by one
        }
        System.out.println(" The original number "+ num+" and that count "+count);
    }
}
