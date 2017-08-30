package leecode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
public int majorityElement(int[] nums) {
       Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       int maj = 0;
       for(int num:nums){
    	   if(!map.containsKey(num)){
    		   map.put(num, 1);
    	   }else{
    		   map.put(num, map.get(num)+1);
    	   }
    	   if(map.get(num)>nums.length/2){
    		   maj = num;
    		   return maj;
    	   }
       }
       return maj;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[]{1,1,1,1,1,2,2,2,2,2,2,2,22,2,2,2,2,2,2,2,2,3,4,4,4,1};
		System.out.println(new MajorityElement().majorityElement(a));
	}

}
