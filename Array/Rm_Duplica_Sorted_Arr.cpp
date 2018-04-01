#include <iostream>
#include <vector>
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

int main()
{
    Rm_Duplica_Sorted_Arr ans ;
    vector<int> nums;
    nums.push_back(1);
    nums.push_back(1);
    nums.push_back(2);
    int length = ans.removeDuplicates(nums);
    cout << length << endl;
    for(int i=0; i<length; i++)
        cout<<nums[i]<<" ";
    cout<<endl;
    return 0;
}