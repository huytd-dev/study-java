public class MyThread extends Thread{
    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("this is a deamon thread is running!");
        }else {
            System.out.println("this user thread is running!");

        }
    }
}
