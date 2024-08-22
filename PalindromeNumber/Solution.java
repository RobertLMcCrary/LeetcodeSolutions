package PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        String intStr = String.valueOf(x); 
        String revIntStr = new StringBuilder(intStr).reverse().toString();
        
        if (intStr.equals(revIntStr)) {
            return true;
        }
        return false;

    }   
}