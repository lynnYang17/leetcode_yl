#include <iostream>
using namespace std;
class Rm_Duplica_Sorted_Arr{
    public:
        int removeDuplicates(vector<int>& nums){
            if(nums.empty()) return 0;
            int index = 0;
            for(int i = 1;i<nums.size();i++){
                if(nums[index] != nums[i]){
                    nums[++index] = nums[i];
                }
            }
            return index + 1;
        }
};