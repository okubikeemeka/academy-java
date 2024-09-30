package com.bptn.course._04_arrays;

public class insertPosition {

	public static int searchInsert (int[] nums, int target) {
		
		int n = nums.length;
        for (int i = 0; i < n; i++){
            if (nums[i] >= target){
                return i;
            }
        }
        return n;

    }
    public static void main (String [] args){

      int nums[] = {1,2,4,6,8}, target = 6;
      int nums1[] = {1,3,5,6,8}, target1 = 4;
      int nums2[] = {1,3,5,7,9}, target2 = 7;

     System.out.println(searchInsert(nums, target));
     System.out.println(searchInsert(nums1, target1));
     System.out.println(searchInsert(nums2, target2)); 
    }

	}


