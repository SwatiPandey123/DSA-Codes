package binary_search;

public class Count_of_element_in_sorted_array {
	public static void main(String[]args) {	
		int arr[]= {1,2,4,6,10,10,10,11,15};
		int target=10;
		int count1=first(arr,target);
		int count2=last(arr,target);
		int totalcount=count2-count1+1;
		System.out.println(totalcount);
	}

	
	//public int[] searchRange(int[] nums, int target) {
	        //int[]arr=new int[2];
	      // arr[0]=first(nums,target);
	        //arr[1]=last(nums,target);
	     //  return arr;  
	    //}
	  //  
	    public static  int  first(int[]arr,int target){
	        int res=-1;
	        int l=0;
	        int r=arr.length-1;
	        while(l<=r){
	            int mid=l+(r-l)/2;
	            if(target==arr[mid]){
	                if( mid-1>=0&&arr[mid-1]==target){

	                    r=mid-1;
	                }
	                else{
	                    return mid;
	                }
	                
	            }
	            else if(target<arr[mid]){
	                r=mid-1;
	            }
	            else{
	                l=mid+1;
	            }
	        }
	        return res;
	    }
	public  static int last(int[]arr,int target){
	     int res=-1;
	        int l=0;
	        int r=arr.length-1;
	        while(l<=r){
	            int mid=l+(r-l)/2;
	            if(arr[mid]==target){
	                if(mid+1<=arr.length-1 && target==arr[mid+1]){
	                    l=mid+1;  
	                }
	                else{
	                    return mid;
	                }
	            }
	            else if(target<arr[mid]){
	                r=mid-1;
	            }
	            else{
	                l=mid+1;
	            }
	        }
	        return res;
	}
	}
		
		
		
		
		
		
		
		
		
		
	
	


