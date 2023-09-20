import java.util.ArrayList;

public class Solution {
    private static ArrayList<ArrayList<String>> sentences(String[][] grid) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> currentSentence = new ArrayList<>();
        getAllSentences(grid, 0, currentSentence, result);
        return result;
    } 

    private static void getAllSentences(String[][] words, int row, ArrayList<String> curr, ArrayList<ArrayList<String>> result) {
        if (row == words.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < words[0].length; i++) {
            curr.add(words[row][i]);
            getAllSentences(words, row + 1, curr, result);
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {
        String[][] words =  {{"you", "we"},
                            {"have", "are"}};

        ArrayList<ArrayList<String>> result = sentences(words);
        for(ArrayList<String> sentence: result) {
            System.out.println(sentence.toString());
        }
    }
}

