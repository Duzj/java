package Java_test.algorithm_test;

public class SwordFinger{
	
	/*1、数字中重复的数字
	 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
	 * 数组中某些数字是重复的，但不知道有几个数字是重复的，
	 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
	 * 思路：将数字nums[i]调整到相同下标i的位置*/

	public boolean duplicate(int[] nums, int length, int[] duplication) {
	    if (nums == null || length <= 0)
	        return false;
	    for (int i = 0; i < length; i++) {
	        while (nums[i] != i) {
	            if (nums[i] == nums[nums[i]]) {
	                duplication[0] = nums[i];
	                return true;
	            }
	            swap(nums,i,nums[i]);
	        }
	    }
	    return false;
	}
  private void swap(int [] nums,int i,int j) {
	  int t=nums[i];
	  nums[i]=nums[j];
	  nums[j]=t;
  }
/* 2、二维数组中的查找 
 * 给定一个二维数组，其每一行从左到右递增排序，
 * 从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 * 思路：从右上角查找，大的在下面，小的在左边*/
	
  public boolean Find(int target, int [][] matrix) {
	  if(matrix==null||matrix.length==0||matrix[0].length==0) {
		  return false;
	  }
	  int rows = matrix.length;
	  int cols= matrix[0].length;
	  int r=0,c=cols-1;
	  while(r<rows&&c>=0) {
		  if(matrix[r][c]==target) {
			  return true;
		  }
		  else if(matrix[r][c]<target) {
			  r++; 
		  }else {
			  c--;  
		  }	  
	  }
	  return false;
	  
  }
  /*3、替换空格
   * 将一个字符串中的空格替换成 "%20"*/
   public String replacestr(String str) {
	   int strlen  = str.length();
	   for (int i=0;i<strlen;i++) {
		   if(str.charAt(i)==' ') {
			   
		   }
		   }
	   return str.toString();
   }
  
	public static void main(String [] args) {
		/*1、数字中重复的数字*/
		int [] nums = {0,3,1,2};
		int [] duplication = new int[1];
		SwordFinger test  = new SwordFinger();
		test.duplicate(nums, 4, duplication);
		System.out.println("nums数组中的一个重复数字为："+duplication[0]);
		/*2、二维数组中的查找*/
		int target=17;
		int [][] matrix= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		if(test.Find(target, matrix)) {
			System.out.println("目标数字"+target+"在二维数组中");
		}else {
			System.out.println("目标数字"+target+"不在二维数组中");
		}
		
	}
}