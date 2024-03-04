package Com.java;

public class SingletonEx {
    private static SingletonEx instance;
    private int number;

    private SingletonEx() {

    }

    public static synchronized SingletonEx getInstance() {
        if (instance == null) {
            instance = new SingletonEx();
        }
        return instance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public synchronized int getAndSetNumber(int number) {
        setNumber(number);
        return getNumber();
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("Thread 1 - Number: " + SingletonEx.getInstance().getAndSetNumber(10)));
        Thread thread2 = new Thread(() -> System.out.println("Thread 2 - Number: " + SingletonEx.getInstance().getAndSetNumber(20)));

        thread1.start();
        thread2.start();
    }
}

