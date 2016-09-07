import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alina on 06.09.16.
 */
public class Telephone2 {
    public static void main (String[]args){
        System.out.println(checkNumb2("+7-456-456 -45-45"));
        System.out.println(checkNumb2("+7-456-456-45-45"));
        System.out.println(checkNumb2("+7-456-456-4545"));
        System.out.println(checkNumb2("+7 -456 -456 -45 -45"));


    }

    public static boolean checkNumb2(String number){
        Pattern p = Pattern.compile("\\+7(\\-[0-9]{3})\\1\\s(\\-[0-9]{2})\\2");
        Matcher m = p.matcher(number);
        return m.matches();
    }
}
