package Module2OOP;

public class OppFun {
    public static void main(String[] args) {
        Test obj = new Test();
        //obj.name;
        obj.Code();
        obj.Sleep();
        //System.out.println(obj.name);

    }

    }
class Test {
    int marks;
    String name = "UseName";

    void Code()
    {

        System.out.println(name + " Coding");
    }
    void Sleep()
    {
        Code();
        System.out.println(name + " Sleeping");
    }
}
