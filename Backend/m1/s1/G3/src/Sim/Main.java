package Sim;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     Sim sim1 = new Sim("3291537052");
     System.out.println(Arrays.toString(sim1.getLastCalls()));
     sim1.stampaSim();
    }
}
