class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int[] count = new int[26];
        int[] left = new int[26];
        int[] right = new int[26];

        Arrays.fill(left , -1);
        Arrays.fill(right , -1);

        List<Integer> order = new ArrayList<>();
        for(int i = 0; i< s.length(); i++){
            int c = s.charAt(i) - 'a';

            if(count[c] == 0) {
                left[c] = i;
                order.add(c);
            } 
            count[c]++;
            right[c] = i;
        }
        List<String> res = new ArrayList<>();
        Deque<int[]> queue = new ArrayDeque<>();

        for(int c : order) {
            queue.addFirst(new int[] {left[c], right[c], count[c]});

            int first = Integer.MAX_VALUE;
            int last = Integer.MIN_VALUE;
            int total = 0;

            for(int[] item : queue) {
                total += item[2];
                first = Math.min(first, item[0]);
                last = Math.max(last, item[1]);

                if(total == last - first + 1){
                    break;
                }
            }
            if(total == last - first + 1){
                res.add(s.substring(first, last + 1));
                queue.clear();
            }
        }
        return res;
    }
}