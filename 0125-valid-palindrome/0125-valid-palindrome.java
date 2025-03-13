import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
       int left =0 ; 
       int right = s.length() -1;

       boolean answer = true;


       while(left < right)
       {
        while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
        {
            left++;
        }

        while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
        {
            right--;
        }

        if(Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left)))
        {
            answer = false;
            return answer;
        }
        left++;
        right--;
       }
        return answer;
    }
}