// their are two ways to use threads in java first is by extending thread class
// and second is by implement runnable interface both can be used to create Threads

// class Error extends Thread {     //--> this is extended class to use it remove slashes
class Error implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("hello good morning");
            System.out.println("i am harsh");
        }
    }
}

// class Innermyerrortest extends Thread {
class Innermyerrortest implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("hello good afternooon");
            System.out.println("my name is happy");
        }
    }

}

public class thr_run {
    public static void main(String[] args) {
        Error h1 = new Error();
        Thread harsh = new Thread(h1); 
        Innermyerrortest h2 = new Innermyerrortest();
        Thread happy = new Thread(h2);
        harsh.start();
        happy.start();

    }

}
