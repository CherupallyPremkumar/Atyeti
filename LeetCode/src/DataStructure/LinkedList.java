package DataStructure;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

 final class D {
    public String revere(String str) {
        StringBuilder out = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            out.append(str.charAt(i));

        }
        return out.toString();

    }
    public Boolean reverepal(String str) {
        StringBuilder out = new StringBuilder();
        if (!str.isEmpty()) {
            for (int i = str.length() - 1; i >= 0; i--) {
                out.append(str.charAt(i));

            }
            System.out.println(out.toString());
            if (out.toString().equals(str)) {
                return true;
            }
        }


          return false;
    }


    public String reverseNormal(String str) {
        String s = new String();
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        return s;
    }

    public static boolean String_check(String str) {
        str=str.toLowerCase();
        if(!str.isEmpty()) {
            Map<Character, Boolean> hashMap = new HashMap<>();
            hashMap.put('a', true);
            hashMap.put('e', true);
            hashMap.put('i', true);
            hashMap.put('o', true);
            hashMap.put('u', true);
            for (int i = 0; i < str.length(); i++) {
                if (hashMap.containsKey(str.charAt(i))) {
                    return true;
                } else {
                    return false;
                }
            }
        }return false;

}
    public boolean String_check2(String str) {
  return str.toLowerCase().matches(".*[aeiou]*.");
    }
    public boolean prime_number(Integer n)
    {
        if(n==1) return true;
        if(n==2) return true;
        int m=n/2;
        if(m%2==0)
        {
            return false;
        }

    return true;
    }

    public Integer fabi(Integer n)
    {
        if (n>0)
        {
            int l=fabi(n--) +fabi(n-2);
            return l;
        }

        return 0;
    }
    public String removeWhiteSpaces(String str)
    {
        StringBuilder out=new StringBuilder();
        char[] characters=str.toCharArray();

        for (char n:characters)
        {
         if(!Character.isWhitespace(n))
         {
             out.append(n);

         }
        }

        return out.toString();
    }
    public String removetrailing(String str)
    {
        str=str.strip();
        return str;
    }
    public List sort(List ltr)
    {
        List l=sort(ltr);

        return l;
    }
    public void Linked()
    {

    }
    public static void main(String[] args)
                    {
                      final D d=new D();
                      String str="     Addd  A";
                      List list=new ArrayList();
                      list.add(1);
                      list.add(2);
                      list.add(0);
                        list.add(11);
                   /*     System.err.println(d.revere(str));
                        System.err.println(d.reverseNormal(str));
                        StringBuilder s=new StringBuilder(str);
                        System.err.println(s.reverse());
                        System.out.println(String_check(str));
                        System.out.println(d.String_check2(str));
                        System.out.println(d.prime_number(9));*/
//                        System.out.println(d.fabi(5));
                       /* System.out.println("pal"+d.removetrailing(list));*/
                        System.out.println(d.sort(list));

                    }
                }










