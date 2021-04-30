public class Demo_for4 {
    public static void main(String[] args) {

        //1, Start from 1st line
        //2, Cricle every 1 for loop
        //3, Remove the redandunt i < = j
        //4, Change line
        
        for (int j = 1 ; j <= 9; j++){
            for (int i = 1; i <= j; i++) {
                System.out.print(j + "*" + i + "=" + (j*i) + "\t");
        }
            System.out.println();
        }
    }
}