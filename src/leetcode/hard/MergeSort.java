package leetcode.hard;

import java.util.Arrays;

public class MergeSort {
	  public static void main(String[] args) {
	        
	        int nums[] = {5,2,3,1};
	        System.out.println(Arrays.toString(mergeSort(nums)));
	    }    
	         
	    private static int[] mergeSort(int[] nums){
	        if(nums.length == 1){
	            return nums;
	        }
	        int mid=nums.length/2;
	        int[] left=mergeSort(Arrays.copyOfRange(nums,0,mid));
	        int[] right=mergeSort(Arrays.copyOfRange(nums,mid, nums.length));

	         return finalMergedSort(left,right);
	    }
	    private static int[] finalMergedSort(int[] left, int[] right){
	        int[] sortedArray= new int[left.length+right.length];

	        int i=0;
	        int j=0;
	        int k=0;

	        while(i<left.length && j<right.length){
	            if(left[i]<right[j]){
	                sortedArray[k]=left[i];
	                i++;
	            }else{
	                sortedArray[k]=right[j];
	                j++;
	            }
	            k++;
	        }

	        while(i<left.length){
	            sortedArray[k]=left[i];
	            i++;
	            k++;
	        }
	        while(j<right.length){
	            sortedArray[k]=right[j];
	            j++;
	            k++;
	        }
	        return sortedArray;
	    }
	}