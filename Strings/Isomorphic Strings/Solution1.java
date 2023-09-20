import java.util.*;

public class Solution1
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1, String str2)
    {
        if (str1.length() != str2.length())
            return false;

        Map<Character, Character> mapping1 = new HashMap<>();
        Set<Character> visited = new HashSet<>();
        
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if (!mapping1.containsKey(ch1)) {
                if (visited.contains(ch2))
                    return false;
                mapping1.put(ch1, ch2);
                visited.add(ch2);
            } else if (mapping1.get(ch1) != ch2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "xyy";

        System.out.println(areIsomorphic(s1, s2));
    }
}
