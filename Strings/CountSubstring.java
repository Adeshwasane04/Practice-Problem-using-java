package Strings;

public class CountSubstring {
    public static void main(String[] args) {
        String str = "  ";
        int k = 2;
        System.out.println(countVowelsConsonant(k, str));
    }

    static int countVowelsConsonant(int k, String str) {
        int TVowels = 5;
        int subStringSize = TVowels + k;
        int Currentcount = 0;

        if (str.length() >= subStringSize) {
            for (int i = 0; i <= str.length() - subStringSize; i++) {
                String newStr = str.substring(i, i + subStringSize);
                if (checkCase(newStr, k)) {
                    Currentcount++;
                }
            }
        } 
        return Currentcount;
    }

    static boolean checkCase(String newStr, int k) {
        int VCount = 0;
        int Ccount = 0;
        newStr = newStr.toLowerCase();

        for (char newCh : newStr.toCharArray()) {
            if (newCh == 'a' || newCh == 'e' || newCh == 'i' || newCh == 'o' || newCh == 'u') {
                VCount++;
            } else if (isConsonants(newCh)) {
                Ccount++; 
            }
        }
        
        return VCount == 5 && Ccount == k; 
    }

    static boolean isConsonants(char ch) {
        return ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1;
    }
}
