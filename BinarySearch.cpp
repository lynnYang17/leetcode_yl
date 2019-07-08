#include <iostream>
#include <vector>

using namespace std;

int BinarySearch(vector<int> &nums, int target){
    int left = 0;
    int right = nums.size() - 1;
    int mid;
    while(left <= right){
        mid = (left + right)/2;
        if(nums[mid] == target){
            printf("find the target. ");
            return mid;
        }else if (target > nums[mid]){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
    printf("didn't find target. ");
    return -1;
}