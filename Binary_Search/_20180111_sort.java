public class _20180111_sort {
	
	//int a[] = {98,34,12,56,3326,76,234,6568,34,657,888,90,123,12,6,3,7,1354,76,89,0};

	public static void main(String[] args) {
		int a[] = {98,34,12,56,3326,76,234,6568,34,657,888,90,123,12,6,3,7,1354,76,89,0};
		_20180111_sort s = new _20180111_sort();
		s.BubbleSort(a, a.length);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "  ");
		}
	}

	public void BubbleSort(int a[] ,int n){
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-1-i; j++){
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