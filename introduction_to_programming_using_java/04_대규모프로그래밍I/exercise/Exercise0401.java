public class Exercise0401 {
    public static String printCapitalized(String str) {
        String retStr = "";
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                char c = (char) (str.charAt(i) - 32);
                retStr = retStr + c;
            }
            else
                retStr = retStr + str.charAt(i);
        }
        return retStr;
    }

    public static void main(String[] args) {
        String str = "i Am yOunHO";

        str = printCapitalized(str);

        System.out.println(str);
    }
}
