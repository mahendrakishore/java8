public class MethodReff {

    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
       // InterMethodReff imr = (a,b)-> System.out.println(a+b);
        InterMethodReff imr = new MethodReff()::sum;
        imr.add(2,2);

    }
}
