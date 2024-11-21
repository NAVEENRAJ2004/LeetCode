import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                arr.add(Character.toLowerCase(c));
            }
        }
        int left = 0, right = arr.size() - 1;
        while (left < right) {
            if (arr.get(left) != arr.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
