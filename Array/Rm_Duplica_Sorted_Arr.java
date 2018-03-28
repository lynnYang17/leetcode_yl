import java.util.Iterator;
import java.util.ArrayList;
//#include <iostream>
//using namespace std;
//int main(){
//	cout << "Hello World!" << endl;
//	return 0;
//}
public class Rm_Duplica_Sorted_Arr {
    public static void main(String[] args) {
        Rm_Duplica_Sorted_Arr rdsa = new Rm_Duplica_Sorted_Arr();
        int[] nums = {1,1,2,5,5,6,9,9};
        int length = rdsa.removeDuplicates(nums);
        System.out.println("result_array's length is : " + length);
    }
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++){//array to arraylist
            result.add(nums[i]);
        }
        for(int j = 0;j < result.size()-1;j++){
            int key = result.get(j);
            for(int k = j+1;k < result.size();k++){
                if(key - result.get(k) == 0){
                    result.remove(k);
                    k--;
                }
            }
        }
        for(int m = 0;m < result.size();m++){
            nums[m] = result.get(m);
        }
        for(Iterator it = result.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        return result.size();
    }
}