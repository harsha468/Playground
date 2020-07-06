#include <iostream>
using namespace std;
int main()
{
  int s,e;
  cin>>s;
  cin>>e;
  int k=0,sum=0;
  for(int i=s;i<=e;i++)
  {
      k=1;
      sum=0;
      while(k<i)
      {
        if (i%k==0)
          sum+=k;
        k++;  
      }
    if(sum==i)
      cout<<i<<" ";
  }
}