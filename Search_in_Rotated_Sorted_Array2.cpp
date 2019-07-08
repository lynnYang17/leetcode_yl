// 0 0 1 2 2 5 6 
// 6 0 0 1 2 2 5 
// 5 6 0 0 1 2 2 
// 2 5 6 0 0 1 2 
// 2 2 5 6 0 0 1 
// 1 2 2 5 6 0 0 
// 0 1 2 2 5 6 0

#include <iostream>
#include <vector>

using namespace std;

bool Search(vector<int> &nums, int target){
    int left = 0;
    int right = nums.size();
    int mid = 0;
    while(left <= right){
        mid = (left + right)/2;
        if(nums[mid] == target){
            return true;
        }else if(nums[mid] == nums[right]){
            right--;
        }else if (nums[mid] < nums[right])
        {
            if(target > nums[mid] && target <= nums[right]) left = mid + 1;
            else right = mid - 1;
        }else{
            if(target >= nums[left] && target < nums[mid])  right = mid - 1;
            else left = mid + 1;
        }
    }
    return false;
}