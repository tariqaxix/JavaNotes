package FinalExam;

import java.util.HashMap;
import java.util.Map;

public class RotationalCipher {
    private int shiftKey;
    private Map<Character, Character> charMap;

    public RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
        this.charMap = new HashMap<>();
        buildCharMap();
    }

    private void buildCharMap() {
        for (char c = 'a'; c <= 'z'; c++) {
            char rotatedChar = (char)((c - 'a' + shiftKey) % 26 + 'a');
            charMap.put(c, rotatedChar);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            char rotatedChar = (char)((c - 'A' + shiftKey) % 26 + 'A');
            charMap.put(c, rotatedChar);
        }
    }

    public String rotate(String data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (charMap.containsKey(c)) {
                sb.append(charMap.get(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
