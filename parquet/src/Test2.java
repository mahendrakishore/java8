public class Test2 extends Test1 {



    public  String methodA(String varA, String varB) {
        return  varA+ varB;
    }



    public static void main(String[] args)    {
        Test1 test1 = new Test2();
       // test1.methodA("A","B");
    }
}
