import java.util.Scanner;

/**
 * Created by xtantransh on 5/7/17.
 */
public class RepeatNum {
    public static void main(String[] args) {

        int j,n=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int i = sc.nextInt();
        //i==n;
        while(i>=1){
            j=i;
            while(j>=1){
                System.out.println(+i);
                j--;
            }
            System.out.println("\n");
            i--;
        }

    }
}
