public class _20180113_nextGreatestLetter {
	public static void main(String[] args) {
		/*char a = '9';
		System.out.println(a + ":" + (int)a);
		System.out.println(a + ":" + Character.getNumericValue(a));*/
		char[] letters = {'c', 'f', 'j'};
		char target = 'e';

		_20180113_nextGreatestLetter ngl = new _20180113_nextGreatestLetter();
		ngl.nextGreatestLetter(letters,target);

	}
	public char nextGreatestLetter(char[] letters, char target) {
        char[] temp = new char[letters.length + 1];
        for(int i = 0; i < letters.length; i++){
        	temp[i] = letters[i];
        }
        temp[letters.length] = target;
        for(int j = 0; j < temp.length; j++){
        	System.out.println(temp[j]);
        }
        System.out.println(temp.length);
        int locate = binarySearch(temp,target);
        System.out.println(locate);
        if(locate == temp.length -1 || locate == temp.length - 2){
        	System.out.println("Output is target : " + temp[0]);
        	return temp[0];
        }else {
        	System.out.println("Output is not target: " + temp[locate + 1]);
        	return temp[locate + 1];
        }

    }

    public int binarySearch(char [] a, char key){
		int mid = 0;
		int left = 0;
		int right = a.length - 1;

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