package REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExp {
    public static void main(String[] args) {
        String REgex="\\b[a-z]+[]\\b";
     Pattern p=Pattern.compile(REgex,Pattern.CASE_INSENSITIVE);
     Matcher m=p.matcher("prem1");
     Boolean n=m.find();

        System.out.println(n);

    }
}
