#include <iostream>
using namespace std;
int main()
{
   int n,m;
  cin>>n;
  cin>>m;
  int s=m+n;
  int sum=0,i=1;
  while(i<s)
  {
    if (s%i==0)
      sum+=i;
    i++;
  }
  if(sum==s)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}