import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alina on 06.09.16.
 */
public class RandomNum2 {
    public static void main (String[]args){
        int i = 0;
        int generated_num = 0;
        Random r = new Random();
        while (i<10) {
            int num = r.nextInt(10000000);
            if (check1(Integer.toString(num)) == true){
                System.out.println(num + "  good");
                i++;
            }else{
                System.out.println(num);
            }
            generated_num++;
        }
        System.out.println("Total number of generated numbers:" + '\n' + generated_num);


    }

    public static boolean check1(String userNameString){
        Pattern p = Pattern.compile("(([013579]?)+(([02468]{1,2})?)(?![2468]))+");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

}
