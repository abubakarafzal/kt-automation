
import java.util.*;

public class g {

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter an integar to maximum Even Number List");

        int max = myobj.nextInt();

        int i;
        for (i = 2; i < max; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number :" + i);
            }

        }
    }
}
