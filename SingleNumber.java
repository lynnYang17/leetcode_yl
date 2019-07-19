class SingleNumber{
	public static void main(String[] args){
		//
	}
	private int singelNum(int[] nums){
		int index = -1;
		for(int i = 0; i < nums.length - 1; i++){
			if(nums[i] ^ nums[i+1] == 1){
				index = i;
			}
		}
		return nums[index];
	}
}
