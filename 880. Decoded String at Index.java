class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                size *= ch - '0';
            } else {
                size++;
            }
        }
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            k = (int)(k % size);
            if (k == 0 && Character.isLetter(ch)) {
                return Character.toString(ch);
            }
            if (Character.isDigit(ch)) {
                size /= ch - '0';
            } else {
                size--;
            }
        }
        return "";
    }
}
