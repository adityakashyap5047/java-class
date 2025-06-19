class Table{

    synchronized void print(int n){
        for (int i = 0; i <= 5; i++) {
            
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted");
            }
        }
    }
}

class Thread1 extends Thread{
    Table t;
    
    Thread1(Table t){
        this.t = t;
    }

    public void run(){
        t.print(5);
    }
}

class Thread2 extends Thread{
    Table t;
    
    Thread2(Table t){
        this.t = t;
    }

    public void run(){
        t.print(100);
    }
}

public class Scnchronization {
    
    public static void main(String[] args) {
        
        Table obj = new Table();

        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();
        t2.start();
    }
}
