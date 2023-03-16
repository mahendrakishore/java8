public class MyRunT {

    public static void main(String[] args) {
        //MyRun myrun = new MyRun();
        Runnable r = ()->{
            for(int i=0;i<10;i++){
                System.out.println("child thread");
            }  };
        Thread t = new Thread();
        t.start();
        for(int j=0;j<10;j++){
            System.out.println("Main Thread");
        }
    }

}
