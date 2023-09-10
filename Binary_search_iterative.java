package binary_search;

public class Binary_search_iterative {
	public static void main(String[]args) {
		int a[]= {1,2,3,4,7,8,10};
		int target=4;
	int index=	search(a,target);
	System.out.print(index);
	
		
		
		}
	
public static  int search(int a[],int target) {
	
	
	int n=a.length;
	int l=0;
    int r=n-1;
	while(l<=r) {
		
		int mid=(l+r)/2;
		
		if(a[mid]==target) 
			return mid;
		
		else if(target>a[mid]) 
			l=mid+1;
		
		else 
			r=mid-1;
		}
	return -1;	
	
}
}
