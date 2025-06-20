class Sender{
    public void send(String msg){
        System.out.println("Sending " + msg);
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            System.out.println("Thread Interrupted");
        }
        System.out.println(msg + " Sent");
    }
}

class ThreadSend extends Thread{
    private String msg;
    Sender sender;

    ThreadSend(String m, Sender obj){
        this.msg = m;
        this.sender = obj;
    }

    public void run(){
        synchronized(sender){
            sender.send(msg);
        }
    }
}

public class SynchronizedMessage {
    
    public static void main(String[] args) {
        Sender send = new Sender();
        ThreadSend s1 = new ThreadSend("HIII", send);
        ThreadSend s2 = new ThreadSend("Byyy", send);

        s1.start();
        s2.start();

        try{
            s1.join();
            s2.join();
        } catch (Exception e){
            System.out.println("Interrupted");
        }
    }
}
