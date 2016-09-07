import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alina on 07.09.16.
 */
public class RandomNum4 {
    public static void main (String[]args){
        int i = 0;
        int generated_num = 0;
        Random r = new Random();
        while (i<10) {
            int num = r.nextInt(10000000);
            if (check(Integer.toString(num)) == true){
                System.out.println(num);
                i++;
            }
            generated_num++;
        }
        System.out.println("Total number of generated numbers:" + '\n' + generated_num);


    }

    public static boolean check(String userNameString){
        Pattern p = Pattern.compile("([13579][24680])+|([2468][135790])+");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

}
