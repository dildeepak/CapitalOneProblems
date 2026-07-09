package leetcode.hard;

public class MedainSortedArrays { // Leetcode problem 4
	
	public static void main() {
		
		int[] nums1= {1,3};
		int[] nums2= {2};
		int[] nums3= {1,3,4,6,9};
		int[] nums4= {2,5,7,8,10};
		
		System.out.println(finMedianSortedArrays(nums1,nums2));
	}
	
	public static double finMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int total = nums1.length + nums2.length;
		int half = (total + 1)/2;
		
		if(nums2.length < nums1.length) {
			int[] tmp = nums1;
			nums1=nums2;
			nums2=tmp;
		}
		
		int start = 0;
		int end= nums1.length;
		
		while(start <= end) {
			int mid = (start + end) /2;
			int secondMid= half- mid;
			
			int nums1Left  = mid > 0 ? nums1[mid -1]:Integer.MIN_VALUE;
			int nums1Right = mid < nums1.length ? nums1[mid] : Integer.MAX_VALUE;
			
			int nums2Left  = secondMid > 0 ? nums2[secondMid -1]:Integer.MIN_VALUE;
			int nums2Right = secondMid < nums2.length ? nums2[secondMid]:Integer.MAX_VALUE;
			
			if(nums1Left <= nums2Right && nums2Left <= nums1Right) {
				if(total %2 !=0) {
					return Math.max(nums1Left, nums2Left);
				}
				return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;
			}else if (nums1Left > nums2Right) {
				end = mid - 1;
			}else { 
				start = mid + 1;
			}
		}
		return -1;
	}
}
