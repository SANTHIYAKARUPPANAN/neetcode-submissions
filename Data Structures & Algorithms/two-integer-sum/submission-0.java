class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int e=target-nums[i];
            if(map.containsKey(e)){
                res[0]=map.get(e);
                res[1]=i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
