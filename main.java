
public class LearnThread {
    public static void main(String[] args) {
        ThreadOne T1 = new ThreadOne("Thread-1");
        T1.start();

        ThreadTwo T2 = new ThreadTwo("Thread-2");
        T2.start();
    }
}
