package leetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str1 = {"flower", "flow", "flight"};
        String[] str2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(str1));
        System.out.println(longestCommonPrefix(str2));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

