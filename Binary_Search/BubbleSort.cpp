#include <iostream>
#include <vector>

using namespace std;


void BubbleSort(vector<int> &nums){
    for(int i = 0; i < nums.size() - 1; i++){
        for(int j = 0; j < nums.size() -i -1; j++){
            if(nums[j] > nums[j + 1]){
                int temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }
        }
    }
}
