import java.util.Scanner;

/**
 * Created by xtantransh on 5/7/17.
 */
public class RevRepeat {

    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int n=sc.nextInt();
        for (i=n;i>=1;i--) {
            for (j=i;j>=1;j--){
                System.out.println(+j);
            }
            System.out.println("\t");
        }
    }
}
