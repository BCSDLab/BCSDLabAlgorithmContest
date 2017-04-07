#include <iostream>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {
   cin.sync_with_stdio(false);
   
   long long num;
   long long cnt = 0;

   cin >> num;
   for (int i = 1; i <= 25; ++i) {
      cnt += (long long)(num / pow(5, i)) % 500000000000000007;
   }
   cout << cnt % 500000000000000007;

   return 0;
}