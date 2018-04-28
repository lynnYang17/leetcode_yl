//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//Find the median of the two sorted arrays.The overall run time complexity should be O(log(m + n)).
//Example1:
//nums1 = [1, 3]
//nums2 = [2]
//The median is 2.0
//Example2:
//nums1 = [1, 3]
//nums2 = [2, 4]
//The median is 2.5

#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

//MedieanOfTwoSortedArr
int main()
{
    int length;
    vector<int> nums1;
    vector<int> nums2;
    cin >> length;
    int a, b;
    for (int i = 0; i < length; i++){
        cin >> a >> b;
        nums1.push_back(a);
        nums2.push_back(b);
    }
    double mediean = -1;
    int left = 0;
    int right = length - 1;
    int mid;
    while (left < right - 1)
    {
        mid = (left + right) / 2;
        if (nums1[mid] == nums2[length - mid - 1])
        {
            mediean = nums1[mid];
            return 0;
        }
        else if (nums1[mid] > nums2[length - mid - 1])
        {
            right = mid;
        }
        else
        {
            left = mid;
        }
    }
    if(mediean < 0.){
        int large = max(nums1[left], nums2[length - right - 1]);
        int little = min(nums1[right], nums2[length - left - 1]);
        mediean = (large + little)*1.0/2.0;
    }
    //mediean = (nums1[mid] + nums2[length - mid - 1]) / 2;
    cout << mediean << endl;
    return 0;
}