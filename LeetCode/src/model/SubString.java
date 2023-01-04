package model;

import java.util.*;

public class SubString {

        public static void main(String[] args)
        {
            String val = "abcd1";
            int length = val.length();
            List<String> total = new ArrayList<>();
            int i = 0;
            int j = 2;
            for (int k = 0; k < length; k++) {
                for (int l = 0; l < length; l++) {
                    if (i < length && j <= length) {
                        total.add(val.substring(i, j));
                    }
                    i++;
                    j++;
                }
                i = 0;
                j = total.get(total.size() - 1).length() + 1;
            }
            System.out.println(total.size() + length);
            System.out.println(total);

        }



    }

