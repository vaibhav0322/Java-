//import com.sun.java.util.jar.pack.Instruction;

import java.util.Scanner;

/**
 * Created by xtantransh on 5/7/17....
 */
public class CollegeGrade {

    void Marks(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks A1-");
        int a =sc.nextInt();

        System.out.println("Enter the marks A2-");
        int b =sc.nextInt();

        System.out.println("Enter the marks A3-");
        int c =sc.nextInt();

        System.out.println("Enter the marks A4-");
        int d =sc.nextInt();

        System.out.println("Enter the marks A5-");
        int e =sc.nextInt();

         int avg = (a+b+c+d+e)/5;
        System.out.println("Your's Average Marks is = " +avg);

        if(avg>=80){
            System.out.println("You got Distinction");
        }else if(avg>=60){
            System.out.println("You got First Class");
        }else if(avg>=40){
            System.out.println("You got Pass class");
        }
    }


    public static void main(String[] args) {
    CollegeGrade cg=new CollegeGrade();
    cg.Marks();
    }
}
