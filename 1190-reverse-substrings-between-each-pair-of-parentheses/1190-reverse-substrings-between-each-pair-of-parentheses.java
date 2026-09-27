class Solution { 
    public String reverseParentheses(String s) { 
        int n = s.length(); 
        StringBuilder result = new StringBuilder(); 
        int i = 0;
        int[] sath = new int[n];
        int[] open = new int[n];
        int top = -1;
        while (i < n) {
            if (s.charAt(i) == '(') {
                open[++top] = i;
            }
            else if (s.charAt(i) == ')') {
                int j = open[top--];
                sath[i] = j;
                sath[j] = i;
               }
                i++;
               }
               i = 0;
        int disha = 1;
        while (i < n) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == ')') {
                i = sath[i];
                disha = -disha;
            } 
            else {
                result.append(ch);
            }
            i += disha;
        }
        return result.toString(); 
    } 
}