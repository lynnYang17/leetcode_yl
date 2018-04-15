import java.util.Iterator;
import java.util.ArrayList;

public class Rm_Duplica_Sorted_Arr {
    public static void main(String[] args) {
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int index = 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if((nums[index] == nums[i]) && count < 2){
                nums[++index] = nums[i];
                count++;
            }else if(nums[index] != nums[i]){
                nums[++index] = nums[i];
                count = 1;
            }
        }
        return index + 1;
    }
}