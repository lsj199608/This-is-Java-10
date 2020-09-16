public class ThreadTest extends Thread{
    public void run(){
        try{
            for(int i=0; i<10; i++){
                Thread.sleep(200);
                System.out.println("알기 쉽게 해설한 자바 : "+i);
            }
            System.out.println("컴퓨터 공학과 3학년 20150940 이승재");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadfromThread{
    public static void main(String[] args){
        ThreadTest t = new ThreadTest();
        t.start();

    }
}
