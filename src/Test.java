import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kusala on 10/17/15.
 */
public class Test {

    public static void main(String[] args) {

        List<String> matchList1 = new ArrayList<String>();
        List<String> matchList = new ArrayList<String>();
        Pattern regex = Pattern.compile("\\{(.+?)\\}");

        String parseMe = "This { y_chat } is a test{test}";

        Matcher regexMatcher = regex.matcher(parseMe);


        while (regexMatcher.find()) {
            matchList.add(regexMatcher.group());
            matchList1.add(regexMatcher.group(1));
        }

        System.out.println(matchList);
        System.out.println(matchList1);

        StringBuilder str = new StringBuilder();
        str.append("ttt");
        str.append("");
        str.append("uuu");
        System.out.println(str);

        String test = "rrr ttt yyy uuuu";

        String test2 =test.replace("rrr", "***");
        System.out.println(test2);


      //  System.out.println(regexMatcher.group(1));


    }


}
