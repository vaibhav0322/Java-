import java.util.Scanner;

/**
 * Created by xtantransh on 3/7/17.
 */
public class factorial1 {

    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();

        while (a>1){
            fact = fact * a;
            a=a-1;
        }
        System.out.println("Factorial is : "+fact);

    }
}
