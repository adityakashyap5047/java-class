import java.io.*;
import java.util.*;

class Sender{
    public void send(String msg){
        System.out.println("Sending " + msg);
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            System.out.println("Thread Interrupted");
        }
        System.out.println(msg + "Sent");
    }
}

public class SynchronizedMessage {
    

}
