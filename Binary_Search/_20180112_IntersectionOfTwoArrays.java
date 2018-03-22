import java.util.*;
public class _20180112_IntersectionOfTwoArrays {
	public static void main(String[] args){
		_20180112_IntersectionOfTwoArrays inter = new _20180112_IntersectionOfTwoArrays();
		int[] nums1 = {1,2,2,1,4,4,6,7,0};
		int[] nums2 = {2,2,4,5,7};
		int[] result = inter.IntersectionOfTwoArrays(nums1, nums2);
		System.out.print("The result is :	");
		for(int i: result){
			System.out.print(i + "	");
		}
	}
	public int[] IntersectionOfTwoArrays(int[] nums1, int[] nums2){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] flag = new int[100000];
		BubbleSort(nums1,nums1.length);
		for(int i = 0; i < nums2.length; i++ ){
			if(BinarySearch(nums1,nums2[i]) == true){
				System.out.println("find!");
				if(flag[nums2[i]] == 0){
					list.add(nums2[i]);
					flag[nums2[i]]++;
				}
			}
		}
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++){
			result[i] = list.get(i);
		}
		return result;

	}

	public boolean BinarySearch(int [] a, int key){
		int left = 0;
		int right = a.length - 1;
		int mid = 0;

		while(left <= right){
			mid = (left + right)/2;
			if(key == a[mid]){
				System.out.println("The key [" + key + "] was found in : " + mid);
				return true;
			}
			if(key < a[mid]){
				right = mid -1;
			}
			else if(key > a[mid]){
				left = mid + 1;             
			}
		}
		System.out.println("The key was not found. ");
		return false;
	}

	public void BubbleSort(int a[] ,int n){
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j <= n-2-i; j++){
				if(a[j] > a[j+1]){
					swap(a, j, j+1);
				}
			}
		}
	}

	public void swap(int [] a, int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}