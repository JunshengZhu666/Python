import java.util.Arrays;

public class Arraydemo03 {
    public static void main(String[] args) {
        int[] a = { 23, 234, 234, 234234, 345, 5, 6, 345345};

        System.out.println(a);

        System.out.println(Arrays.toString(a));

        // to sort
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        // to fill
        Arrays.fill(a, 2, 4, 0);
        System.out.println(Arrays.toString(a));
    }
}