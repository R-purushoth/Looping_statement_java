import java.util.Scanner;

public class Calculater_Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("***Calculator Menu*** ");
            System.out.println(" 1 Addition:");
            System.out.println(" 2 Subtraction");
            System.out.println(" 3 Multiply");
            System.out.println(" 4 Division");
            System.out.println(" 5 Exit");
            System.out.println("Enter a choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter two number: ");
                    int num1=sc.nextInt();
                    int num2=sc.nextInt();
                    System.out.println("Sum = "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Enter two number: ");
                    int num3=sc.nextInt();
                    int num4=sc.nextInt();
                    System.out.println("Difference = "+(num3-num4));
                    break;
                case 3:
                    System.out.println("Enter two number: ");
                    int num5=sc.nextInt();
                    int num6=sc.nextInt();
                    System.out.println("product = "+(num5*num6));
                    break;
                case 4:
                    System.out.println("Enter two number: ");
                    int num7=sc.nextInt();
                    int num8=sc.nextInt();
                    if(num8!=0) {
                        System.out.println("Div = " + (num7 / num8));
                    }else{
                        System.out.println("could not divisible by zero");
                    }
                    break;
                case 5:
                    System.out.println("program Exit.");
                    break;
                default:
                    System.out.println("Invalid choice. please try again. ");
            }
        }while (choice!=5);

    }
}
