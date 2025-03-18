/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class MyUtilities implements IUtilities {

    @Override
    public int checkIntegerNumber(String value, int min, int max) {
        int result = value.length();
        if (value.length() >= 2 && value.length() <= 10) {
            try {
                result = Integer.parseInt(value);
                result = (result >= min && result <= max) ? result : value.length();
            } catch (Exception e) {
                result = value.length();
            }
        }
        return result;
    }

    public String toTitleCase(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (String word : words) {
            if (word.trim().length() > 0) {
                String temp = word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase();
                result += (temp + " ");
            }
        }
        return result.trim();
    }

    @Override
    public String removeDuplicatedWords(String value) {
        value = value.toLowerCase();
        String[] words = value.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    words[j] = "";
                }
            }
        }

        String temp = "";
        for (String word : words) {
            temp += (word + " ");
        }

        return toTitleCase(temp);
    }

    @Override
    public int checkFormatString(String value) {
        // A.B.C with A is 03 uppercase letters, B is 06 digits, C in [@#$]
        String regex = "^[A-Z]{3}\\.\\d{6}\\.[@#\\$]$";
        // 0
        // GFH.123456.#
        if (value.matches(regex)) {
            String B = value.substring(4, 10);
            return Integer.parseInt(B);
        } else {
            return value.length();
        }
    }

    @Override
    public double sumNumbers(String value) {
        
        // abc12 def8.5 kdje => 12 + 8.5 = 20.5
        //    12    8.5      => [, , , 12, , , 8.5, ...] => sum 
        // Hello Word. Nam nay la nam 2025 va la 2026.
        // 2025 + 2026.0
        String temp = "";
        for (int i = 0; i < value.length(); i++) {
            char x = value.charAt(i);
            if (Character.isDigit(x)) {
                temp += (x);
            } else if (x == '.') {
                if (i > 0 && Character.isDigit(value.charAt(i - 1))) {
                    temp += (x);
                }
            }else {
                 temp +=" ";
            }
        }
        System.out.println(temp);
        
        double sum =0;
        // Chuyển thành mảng
        String[] words = temp.split(" ");
        for (String word : words) {
            if(word.length()>0){
                sum+=Double.parseDouble(word);
            }
        }
        return sum;
    }

    @Override
    public int countPalindrome(String str) {
        // 121 abc aba
        // 2, do la: 121 va aba        
        return 0;
    }

    @Override
    public int findFirstOddNumber(String str) {
        // 10 40 36 85 abc 13 54 => 85
        String[] words = str.split(" ");
        for (String word : words) {
            if(word.length()>0){
                try {
                    int x = Integer.parseInt(word);
                    if(x%2==1)
                        return x;
                } catch (Exception e) {
                }
            }
        }
        return 0;
    }

    @Override
    public int sumAllCharsOfInt(int value) {
        // 987654 => 39
        // -987654 => 39
        value = Math.abs(value);
        String temp = value +"";
        int sum = 0;
        for (int i = 0; i < temp.length(); i++) {
            int x = Integer.parseInt(temp.charAt(i)+"");
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        MyUtilities m = new MyUtilities();
        System.out.println(m.sumAllCharsOfInt(-987654));
    }
}
