import java.util.Scanner;

/**
 * Created by xtantransh on 3/7/17.
 */
public class factorial {

    public static void main(String[] args) {
        int c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int a = sc.nextInt();

        for (int i=1;i<=a;i++){
            c=c*i;
        }
        System.out.println("Factorial is : " +c);



    }
}
