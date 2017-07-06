/**
 * Created by xtantransh on 4/7/17.
 */
public class ConstructoeDemo {


    int x;
    public ConstructoeDemo(){

        System.out.println("In Default Construct");
    }
    public ConstructoeDemo(int x){
        this();                     //call to ConstructorDemo - invoke constructor;
        this.show();                // invoke method;
        this.x=x;                   //pass the parameter to global value  x;
        System.out.println("In Parameteroized Constructor");
        System.out.println("value of para X = " +x);
    }

    void show(){
        System.out.println("Value of X= "+x);
    }

    public static void main(String[] args) {
    ConstructoeDemo cd = new ConstructoeDemo(10);
//    cd.show();
    }
}
