import java.util.Scanner;

public class Palindrome_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int original=num;
        int reversed=0;
        do{
            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
        }while(num!=0);
        if(num==reversed){
            System.out.println(original+" original number is equal to "+reversed);
        }else{
            System.out.println("Original number is not equal to reversed number..");
        }
    }
}
