class Solution {
    public int maxDepth(String s) {
       int n=s.length();
       int current_depth=0;
       int max_depth=0;

       for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch=='('){
            current_depth++;
        }

        max_depth=Math.max(max_depth,current_depth);

        if(ch==')'){
            current_depth--;
        }
       } 
       return max_depth;
    }
}