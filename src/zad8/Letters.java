package zad8;

import java.util.ArrayList;

public class Letters extends Thread {
    ArrayList < Thread> threads= new ArrayList<Thread>();

    public Letters(String abcd) {
        for (int i = 0; i <abcd.length(); i++) {
            threads.add(new Thread("Thread "+ abcd.substring(i,i+1)));
        }
    }

    public ArrayList<Thread> getThreads() {
        return  threads;
    }
    public void run(){
        while(true){
            try{
                System.out.print(this.getName());
                Thread.sleep(1000);
            } catch (InterruptedException ie){
                System.out.println("Thread interrupted");
            }
        }

    }
}
