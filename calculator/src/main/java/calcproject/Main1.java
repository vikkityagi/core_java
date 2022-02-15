package calcproject;
import java.util.Scanner;
public class Main1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        CalcMethod calcmethod=new Calculator();

        System.out.println("Enter the first number:");
        float no1=sc.nextInt();

        System.out.println("Enter which operation do you want to perform");
        char c=sc.next().charAt(0);

        System.out.println("Enter the iind number:");
        float no2=sc.nextInt();

        switch (c){
            case '+':
                System.out.println(no1+""+c+""+no2+" = "+ calcmethod.add(no1,no2));
                break;
            case '-':
                System.out.println(no1+""+c+""+no2+" = "+ calcmethod.subtract(no1,no2));
                break;
            case '*':
                System.out.println(no1+""+c+""+no2+" = "+ calcmethod.multiply(no1,no2));
                break;
            case '/':
                System.out.println(no1+""+c+""+no2+" = "+ calcmethod.divison(no1,no2));
                break;
            default:
                System.out.println("Wrong Data...");
        }
    }
}
