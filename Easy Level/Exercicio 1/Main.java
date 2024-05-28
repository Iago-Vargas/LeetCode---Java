package Ex2;

public class Main {
	 public static void main(String[] args) {
	        int[] nums1 = {3, 2, 3};
	        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
	        
	        System.out.println("O elemento majoritário em nums1 é: " + majorityElement(nums1)); 
	        System.out.println("O elemento majoritário em nums2 é: " + majorityElement(nums2)); 
	    }
	  public static int majorityElement(int[] nums) {
	        int count = 0;
	        Integer candidate = null;

	        for (int num : nums) {
	            if (count == 0) {
	                candidate = num;
	            }
	            count += (num == candidate) ? 1 : -1;
	        }

	        return candidate;
	    }
	}
