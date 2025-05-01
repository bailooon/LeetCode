class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        int total = 0;

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int subtract = 1;
            if (i != s.length() - 1) {
                if (romanMap.get(c) < romanMap.get(s.charAt(i + 1))) {
                    subtract = romanMap.get(s.charAt(i + 1)) - romanMap.get(c);
                    total -= romanMap.get(s.charAt(i + 1));
                    total += subtract;
                    subtract = 0;
                } 

            }
            if(subtract != 0){
            total += romanMap.get(c);
            }

        }

        return total;
    }
}
