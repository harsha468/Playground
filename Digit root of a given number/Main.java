#include<iostream>
using namespace std;
int main()
{
  int N,r,sum=0;
  cin>>N;
  while (N>9)
  {
    sum=0;
    while (N!=0)
    {
      r=N%10;
      sum+=r;
      N=N/10;
      //cout<<N;
    }
    N=sum;
  } 
cout<<N;
}