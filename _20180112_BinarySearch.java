public class _20180112_BinarySearch {
	public static void main(String[] args){
		int a[] = {98,34,12,56,3326,76,234,6568,34,657,888,99,153,12,6,93,7,1354,76,89,0};
		boolean result = false;
		_20180112_BinarySearch bs = new _20180112_BinarySearch();
		bs.BubbleSort(a, a.length);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "  ");
		}
		//System.out.println();
		result = bs.BinarySearch(a,123);

	}

	public boolean BinarySearch(int [] a, int key){
		int left = 0;
		int right = 20;
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
					/*int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;*/
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
