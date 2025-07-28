import java.util.Scanner;

public class One_to_N_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number( N): ");
        int N=sc.nextInt();
        int i=1;
        while(i<=N){
            System.out.println(i);
            i++;
        }
    }
}
