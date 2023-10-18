package example0403;

public class Exercise4_0302 {

    private static void printRow(char ch, int N){
        for(int i = 0; i<N; i++){ // N번만큼
            System.out.print(ch); // ch print
        }
    }
    private static void printRowsFormString(String str){
        for(int i = 0; i<str.length(); i++){
            printRow(str.charAt(i), 25);
        }
    }

    public static void main(String[] args) {
        printRow('a', 100);

        System.out.println( );
        printRowsFormString("hi bixbee");
    }
}
