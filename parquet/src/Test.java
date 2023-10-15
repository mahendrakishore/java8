public class Test {



    public String methodA(int varA, int varB) {
        return String.valueOf(varA + varB);
    }

    public static String methodA(String varA, int varB) {
        return String.valueOf(Integer.parseInt(varA) + varB);
    }

/*
    public static int methodA(int varA, int varB) {
        return varA + varB;
    }
*/

    public static void main(String[] args)    {
        //System.out.println(methodA(0, 1));
        System.out.println(methodA("1", 1));
        //System.out.println(methodA(2, 1));

    }
}
