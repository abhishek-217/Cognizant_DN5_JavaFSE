public class TestLogger {
    public static void main(String[] args) {

        Logger log1 = Logger.getInstance();

        Logger log2 = Logger.getInstance();

        log1.log("First message");

        log2.log("Second message");

        System.out.println(log1==log2);

    }
}
