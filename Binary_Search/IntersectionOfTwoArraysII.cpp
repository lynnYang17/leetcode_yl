#include <iostream>
#include <vector>

using namespace std;

vector<int> intersect(vector<int> &nums1, vector<int> &nums2){
    int left = 0;
    int right = nums1.size();
    for(int i =0; i < nums2.size(); i++){
        int d = BinarySearch(nums1, nums2[i]);
        if (d != -1)
        {
            //delete the nums1[d]
        }
    }
}

int BinarySearch(vector<int> &nums, int d){
    int left = 0;
    int right = nums.size() - 1;
    while(left <= right){
        int mid = (left + right)/2;
        if(nums[mid] == d){
            return mid;
        }else if(d < nums[mid]){
            right = mid - 1;
        }else{
            left = mid + 1;
        }
    }
    return -1;
}

void BubbleSort(vector<int> &nums){
    for(int i = 0; i < nums.size() - 1; i++){
        for (int j = 0; j < nums.size() - i - 1; j++){
            if(nums[j] > nums[j + 1]){
                int temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }
        }
    }
}