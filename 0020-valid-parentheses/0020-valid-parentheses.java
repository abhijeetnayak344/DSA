class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;

        char[] a = s.toCharArray();
        int i = 0;
        for(char b : a){
            if((b & 3) != 1){
                a[i++] = b;
            } else if(i == 0 || ((b - a[--i] + 1) >> 1) != 1){
                return false;
            }
        } 
        return i == 0;
    }
}