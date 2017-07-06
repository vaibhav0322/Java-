import java.util.Scanner;

/**
 * Created by xtantransh on 6/7/17.
 */
public class Logicsxy {

    public Logicsxy(int x,int y){

        int  z=x+++y;
        System.out.println("Value of z = "+z);
        System.out.println("mValue of x = "+x);

        int z1=++x+y;
        System.out.println("Value of z1 = "+z1);

        int z2=y+++x;
        System.out.println("Value of z2 ="+z2);

        int z3=x+y++;
        System.out.println("Value of z3 = "+z3);
    }

    public static void main(String[] args) {
        Logicsxy l=new Logicsxy(10,20);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Value of X- ");
//        int x=sc.nextInt();
//        System.out.println("Enter the value of Y-");
//        int y=sc.nextInt();

//        l.Logic(x,y);
    }
}
