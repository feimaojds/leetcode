package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length<4) return ans;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
        	if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target) break;
        	if(nums[i]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<target) continue;
        	if(i>0&&nums[i]==nums[i-1]) continue;
        	for(int j=i+1;j<nums.length-2;j++){
        		if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target) break;
        		if(nums[i]+nums[j]+nums[nums.length-1]+nums[nums.length-2]<target) continue;
        		if(j>i+1&&nums[j]==nums[j-1]) continue;
        		int low = j+1;
        		int high = nums.length-1;
        		while(low<high){
        			int sum = nums[i]+nums[j]+nums[low]+nums[high];
        			if(sum==target){
        				ans.add(Arrays.asList(i,j,low,high));
        				while(nums[low]==nums[low+1]) low++;
        				while(nums[high]==nums[high--]) high--;
        				low++;
        				high--;
        			}
        			else if(sum<target){
        				low++;
        			}else{
        				high--;
        			}
        		}
        	}
        }
    }

}
