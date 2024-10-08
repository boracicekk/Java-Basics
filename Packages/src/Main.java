import basicmath.Additional;
import basicmath.Log;
//you can also import basicmath.*; this type of usage includes all packets of basicmath.

public class Main {
    public static void main(String[] args) {
        Additional adder = new Additional();
        adder.add(4,6);
        Log log = new Log();
        log.logarithm(2);
    }
}