//Question: https://leetcode.com/problems/two-sum/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums.length <= 0){return null;}
        
        HashMap<Integer,Integer> elements = new HashMap<Integer,Integer>();
            
        for(int i=0;i<nums.length;i++){
            //search for value b such that b = target-a
            if(elements != null && elements.keySet().contains(nums[i])){
                return new int[]{elements.get(nums[i]),i};
            }
            //put target-a & it's index
            elements.put(target-nums[i],i);
        }
        return null;
      }
} 
