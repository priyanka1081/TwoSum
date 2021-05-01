package Arrays;

import java.util.*;

public class TwoNumbers {
	    public int[] twoSum(int[] nums, int target) {
	    	int[] arr= new int[2];
	    	int k=0;
	    	
	    	Map<Integer, Boolean> mp= new HashMap<Integer, Boolean>();
	    	for(int i=0; i<nums.length; i++) {
	    		mp.put(nums[i], true);
	    	}
	    	
	    	for(int j=0; j<nums.length;j++) {
	    		if(mp.containsKey(target-nums[j]) && k==0) {
	    			arr[k]= j;
	    			k++;
	    			j=0;
	    		}else if((target-nums[arr[0]]) == nums[j]){
	    			arr[k]= j;
	    		}
	    	}
	    	
			return arr;
	        
	    }
	    
	    public static void main(String[] args) {
	        TwoNumbers tno= new TwoNumbers();
	        int[] nums = {2,11,15,7};
	        int target = 9;
	        int[] res= tno.twoSum(nums, target);
	        
	        for(int i=0; i<2; i++) {
	        	System.out.println(res[i]);
	        }
	    }

}
