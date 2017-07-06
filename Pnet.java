import java.util.Scanner;

/**
 * Created by xtantransh on 3/7/17.
 */
public class Pnet {

    public static void main(String[] args) {
        int num, i, count=0;
    Pnet p = new Pnet();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = scan.nextInt();

        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}
