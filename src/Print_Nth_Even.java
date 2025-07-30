import java.util.Scanner;

public class Print_Nth_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=1;
        System.out.println("print 1 to N th Even number");
        while(i<=num){
            if(i%2==0){
                System.out.println(i+" is even number:");
            }
            i++;
        }
    }
}
