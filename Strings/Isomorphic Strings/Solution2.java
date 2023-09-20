import java.util.*;

public class Solution2 {
    public static boolean areIsomorphic(String str1, String str2)
    {
        if (str1.length() != str2.length())
            return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (map1[ch1] != map2[ch2])
                return false;

            map1[ch1] = map2[ch2] = i;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "xxx";

        System.out.println(areIsomorphic(s1, s2));
    }
}
