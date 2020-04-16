/* Minimum number of Coins: Earlier ,we solved this problem with the greedy approach. This problem can also be solved by simple recursion, but while using simple recursion we see that the same sub problem are called again and again causing the problem of overlapping sub problems property.We can use Dynamic programming to solve this problem as it possesses both the properties of dynamic programming. Idea is that, re computations of same sub problem can by avoided by constructing a temporary array table[][] in bottom up manner.*/


#include<iostream>
using namespace std;

int minCoins(int coinList[], int n, int value) {
   int coins[value+1];

   if(value == 0)
      return 0;

   coins[0] = 0;

   for (int i=1; i<=value; i++)
      coins[i] = INT_MAX;

   for (int i=1; i<=value; i++) {
      for (int j=0; j<n; j++)
         if (coinList[j] <= i) {
            int tempCoins = coins[i-coinList[j]];
         if (tempCoins != INT_MAX && tempCoins + 1 < coins[i])
            coins[i] = tempCoins + 1;
      }
   }
   return coins[value];     
}

int main() {
   int coins[] = {1,5, 10};
   int n = 4, value;
   cout << "Enter Value: "; cin >> value;
   cout << "Minimum "<<minCoins(coins, n, value)<<" coins required.";
   return 0;
}

