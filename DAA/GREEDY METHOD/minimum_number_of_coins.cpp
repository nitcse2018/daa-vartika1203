/* Minimum Number of Coins: Given coins of  various different denominations ; find out a way to give a        customer an amount with the fewest number of coins. For example, if I ask you to return me change for 30, there are more than two ways to do so,so we’ve to find a way which requires the least number of coins.*/

#include <iostream>
using namespace std;

int get_change(int m) {
 int i,count=0;
int coins[]={10,5,1};
for(i=0;m>0;i++)
{
count=count+m/coins[i];
m=m%coins[i];
}
  return count;
}

int main() {
  int m;
  cout<<"Enter the amount of money:";
  cin >> m;
  cout<<"The minimum number of coins required are: ";
  cout << get_change(m) << '\n';
}
