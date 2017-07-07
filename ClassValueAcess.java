/**
 * Created by xtantransh on 7/7/17.
 */
public class ClassValueAcess{

    int y =20;

    public static void main(String[] args) {
        //overloading ol=new overloading();
        tiger t=new tiger();
        t.character();
    }


}

class tiger{
    ClassValueAcess ol=new ClassValueAcess();
    void character(){
//        int x=10;
        System.out.println("This is example of inheritance" +ol.y);
    }
}
