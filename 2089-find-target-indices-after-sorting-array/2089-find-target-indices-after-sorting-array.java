class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0, eq = 0;
        for(int x : nums)
          if(x < target) less++;
           else if(x == target) eq++;
    List<Integer> ans = new ArrayList<>();
    for(int i = less; i < less + eq; i++) ans.add(i);
    return ans;
    }
}