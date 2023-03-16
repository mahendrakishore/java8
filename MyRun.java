import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
         System.out.println("child thread");
        }
    }
}
