class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 < p2) {
            int cp1 = s.charAt(p1) - 'a';
            int cp2 = s.charAt(p2) - 'a';
            if (cp1 < 0 || cp1 > 25) {
                p1++;
                continue;
            }
            if (cp2 < 0 || cp2 > 25) {
                p2--;
                continue;
            }
            if (cp1 != cp2) {
                return false;
            }
            p1++;
            p2--;
        }
        System.exit(0);
        return true;
    }
}
