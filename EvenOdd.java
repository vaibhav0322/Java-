import java.util.Scanner;

/**
 * Created by xtantransh on 2/7/17.
 */
public class EvenOdd {

    void EvOd(int a){

//    int a=4;
    if(a%2==0){
        System.out.println("No is Even :" +a);
    }else{
        System.out.println("No. is Odd : "+a);
    }
    }
    public static void main(String args[]){
        int a;
        EvenOdd eo = new EvenOdd();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
         a = sc.nextInt();

        eo.EvOd(a);
    }


}
