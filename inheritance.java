/**
 * Created by xtantransh on 7/7/17.
 */
public class inheritance extends superclass {
//int x;

    void getdata(){
//        this.add();
        System.out.println(x);
    }
    public static void main(String[] args) {
        inheritance iht = new inheritance();
        iht.getdata();

    }
}
class superclass{
    final int x=10;
    void add(){
        System.out.println(x);
    }
}