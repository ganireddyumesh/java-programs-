class multithread extends Thread{

    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch( InterruptedException e){

            }
        }
        
    }
}

public class multitherding {
    public static void main(String[] args) {
       multithread t1=new multithread();
       multithread t2=new multithread();
       multithread t3=new multithread();
       t1.start();
       t2.start();
       t3.start();
    }
}
