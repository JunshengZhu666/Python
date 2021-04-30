import javax.print.event.PrintJobListener;

/**
 * @author Junsheng
 * @version 
 */
public class Demo_Operator {
    public static void main(String[] args) {
        

        //++ -- 

        int e = 3;
        int f = e++; // add to f before e
        int g = ++e; // add to e before g 

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        double pow = Math.pow(2,3); // compute log 
        System.out.println(pow);

        // Logic computaions 

        boolean a = true;
        boolean b = false;

        System.out.println("a && b  " + (a&&b)); // and
        System.out.println("a || b  " + (a||b)); // or
        System.out.println("! (a && b)  " + !(a&&b)); // reverse

        // A = 0011 1100
        // B = 0000 1101
        // A&B = and, A|B = or, 
        // << *2, >> /2

        System.out.println(""+a+b);

        // x ? y : z if x == true, =y, else, =z

        int score = 50;
        String type = score < 60 ? "fail" : "pass";

        System.out.println(type);



        


    }
}
