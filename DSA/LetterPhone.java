// https://www.scaler.com/academy/mentee-dashboard/class/9277/homework/problems/147
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class LetterPhone {

    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('1', "1");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        map.put('0', "0");
        List<String> ansList = new ArrayList<>();
        generate(digits, map, ansList, 0, new char[digits.length()]);
        return ansList;
    }

    // 232 ->

    void generate(String digits, HashMap<Character, String> map, List<String> ansList, int index, char[] c) {
        if (index >= digits.length()) {
            if (c.length > 0) {
                ansList.add(String.valueOf(c));
            }
            return;
        }
        char ch = digits.charAt(index);
        String s = map.get(ch);
        for (int i=0; i<s.length(); i++) {
            char t = s.charAt(i);
            c[index] = t;
            generate(digits, map, ansList, index + 1, c);
        }
    }



}