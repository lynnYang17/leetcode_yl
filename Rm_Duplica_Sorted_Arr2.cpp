#include <iostream>
#include <vector>
using namespace std;
class Rm_Duplica_Sorted_Arr2{
    public:
      int removeDuplicates(vector<int>& nums){
          if(nums.empty()) return 0;
          int index = 0;
          int count = 1;
          for(int i = 1; i < nums.size(); i++){
              if ((nums[index] == nums[i]) && count < 2){
                  nums[++index] = nums[i];
                  count++;
              }else if(nums[index] != nums[i]){
                  nums[++index] = nums[i];
                  count = 1;
              }
          }
          return index + 1;
      }
};

int main(){
    Rm_Duplica_Sorted_Arr2 rdsa;
    vector<int> nums;
    nums.push_back(1);
    nums.push_back(1);
    nums.push_back(1);
    nums.push_back(2);
    nums.push_back(2);
    nums.push_back(3);
    nums.push_back(4);
    int length = rdsa.removeDuplicates(nums);
    cout << length << endl;
    for(int i = 0; i < length; i++){
        cout << nums[i] << "";
    }
    cout << endl;
}