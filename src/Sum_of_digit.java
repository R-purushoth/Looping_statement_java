import java.util.Scanner;

public class Sum_of_digit{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sum of digits : ");
        int num=sc.nextInt();
        int sum=0;
        while (num!=0) {
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println(sum);
    }
}
