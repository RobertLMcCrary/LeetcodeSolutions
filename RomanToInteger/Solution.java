package RomanToInteger;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentValue = map.get(s.charAt(i));

            int nextValue = 0;

            if (i + 1 < length) {
                nextValue = map.get(s.charAt(i + 1));
            }

            if (currentValue < nextValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }

        return total;
    }
}
