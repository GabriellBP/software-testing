//Huxley problem 677
package br.ufal.ic.huxley;

import java.util.Map;

public class GrandesAtalhos {
    public static String replaceShortcut(String str, Map<Character, String> shortcuts) {
        if (shortcuts.isEmpty())
            return str;
        char strVector[] = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for (int e = 0; e < strVector.length; e++) {
            if (strVector[e] == '*' && e + 1 < strVector.length && shortcuts.containsKey(strVector[e + 1])) {
                newStr.append(shortcuts.get(strVector[e + 1]));
                e++;
            } else {
                newStr.append(strVector[e]);
            }
        }
        return newStr.toString();
    }

    public static String replaceShortcut2(String str, Map<Character, String> shortcuts) {
        if (shortcuts.isEmpty())
            return str;
        for (char e : shortcuts.keySet()) {
            str = str.replaceAll("\\*" + e, shortcuts.get(e));
        }
        return str;
    }
}
