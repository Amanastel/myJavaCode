import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.util.regex.PatternSyntaxException;


public class Exception {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("[4-9]");
////        Matcher m = p.matcher("abcabcabc");
//        Matcher m = p.matcher("abca097bcabc");
////        System.out.println(m.find());
////        System.out.println(m.find());
////        System.out.println(m.find());
////        System.out.println(m.find());
//        int count = 0;
//        while(m.find()){
//            count++;
////            System.out.println(m.start()+" ------ "+m.end()+" ----- "+m.group());
//            System.out.println(m.start()+" ------ "+m.group());
//        }
//        System.out.println(count);


        System.out.println(Pattern.matches("[amn]","abcd"));
        System.out.println(Pattern.matches("[amn]","a"));
        System.out.println(Pattern.matches("[amn]","n"));
        System.out.println(Pattern.matches("[a-z]","aman"));
        System.out.println(Pattern.matches("[a-z]{4}","aman"));
        System.out.println(Pattern.matches("[abc]{1}[a-z]{3}","aman"));

        System.out.println(Pattern.matches("[786]{1}[0-9]{9}","7007219431"));
    }


}
