public class _20180112_TwoSum {
	public static void main(String[] args){
		_20180112_TwoSum ts = new _20180112_TwoSum();
		/*int[] numbers = {2,7,11,15};
		int target = 9;*/
		int[] numbers = {-1,0};
		int target = -1;
		ts.twoSum(numbers,target);
	}

	public int[] twoSum(int[] numbers, int target){
		int num1 = 0;
		int num2 = 0;
		int[] result = new int[2];
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] <= target){
				num2 = target - numbers[i];
				if(binarySearch(numbers,num2,i+1,numbers.length-1) != -1){
					num1 = numbers[i];
					result[0] = i + 1;
					result[1] = binarySearch(numbers,num2,i+1,numbers.length-1) + 1;
					System.out.println("The two indices are : " + result[0] + "	and	" + result[1]);
					return result;
				}
			}
			else {
				System.out.println("Didn't Find");
			}
		}
		return result;
	}

	public int binarySearch(int [] a, int key,int left, int right){
		int mid = 0;

		while(left <= right){
			mid = (left + right)/2;
			if(key == a[mid]){
				return mid;
			}
			if(key < a[mid]){
				right = mid -1;
			}
			else if(key > a[mid]){
				left = mid + 1;             
			}
		}
		System.out.println("The key was not found. ");
		return -1;
	}
}