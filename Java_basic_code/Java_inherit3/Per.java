import jdk.internal.net.http.common.MinimalFuture;

public class Per {

    //2: Only run once, can be used to set origin 
    {
        System.out.println("Anynom code");
    }

    //1
    static {
        System.out.println("Static code");
    }

    public Per() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Per per = new Per();
        System.out.println("==========");
        Per per2 = new Per();

        //Some functions
        System.out.println(Math.random());
    }
}