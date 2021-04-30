import javax.print.attribute.standard.PrinterInfo;

public class Demo05 {
    public static void main(String[] args) {
        int i = 128;
        double b = (double)i;

        System.out.println(i);
        System.out.println(b);

        System.out.println("==========");
        char c = 'a';
        int d = c+1;
        System.out.println(d);
        System.out.println((char)d);

        System.out.println("=========");
        long money = 1000000L;
        long years = 20L;
        long total = money * years;
        System.out.println(total);
    }
}

