package arasi.learn;

public class stringExamples {

    static String strLiteral = " Sairam ";
    static String str1 = new String("Created by allocating memory ");

    public static String prtReverse(String inp)
    {
        StringBuilder output = new StringBuilder(inp);
        return output.reverse().toString();
    }

    public static boolean isPalindrome(String inp)
    {
       StringBuilder output = new StringBuilder(inp);
       for(int x=0;x< inp.length();x++)
        System.out.println("-"+inp.charAt(x));
       return true;
    }
}
