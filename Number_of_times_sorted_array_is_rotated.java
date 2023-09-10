package binary_search;

public class Number_of_times_sorted_array_is_rotated {
	public static void main(String[]args) {
		int arr[]= {7,8,12,14,1,2,4,6};
		int result=findMin(arr);
		System.out.println(result);
		
	}
	 public static  int findMin(int[]nums) {
	        int start=0;
	        int end=nums.length-1;
	        int n=nums.length;
	        //int res=-1;
	        while(start<=end){
	            int mid=start+(end-start)/2;
	            int next=(mid+1)%n;
	            int prev=(mid-1+n)%n;
	           if(nums[mid]<=nums[prev]&&nums[mid]<=nums[next]) {
	            //return  nums[mid];
	        	   return mid;
	           }
	           else if(nums[mid]<=nums[end]){
	               end=mid-1;
	           }
	           else if(nums[mid]>=nums[start]){
	               start=mid+1;
	           }
	           
	          
	        }
	      return -1;
	    }

}
