#include <iostream>
#include <map>
using namespace std;
 int main(){
     int n, m;
     while(cin >> n >> m){
         map<int, int> ma;
         int x;
         for(int i = 0; i < n; i++){
             cin >> x;
             ma[x]++;
         }
         if(ma[m] == 0){
             cout << "NO" << endl;
         }else{
             cout << ma[m] << endl;
         }
     }
 }