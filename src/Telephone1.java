import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alina on 05.09.16.
 */
public class Telephone1 {
    public static void main (String[]args){
        System.out.println(checkNumb1("8 (917) 123 -34-34"));
        System.out.println(checkNumb1("8 (917) 123-34-34"));
        System.out.println(checkNumb1("8 (917) 123 -3434"));
        System.out.println(checkNumb1("8 (917)-123 -34-34"));
    }

    public static boolean checkNumb1(String number){
        Pattern p = Pattern.compile("8\\s\\(([0-9]{3})\\)\\s[0-9]{3}\\s(\\-[0-9]{2})\\2");
        Matcher m = p.matcher(number);
        return m.matches();
    }
}
