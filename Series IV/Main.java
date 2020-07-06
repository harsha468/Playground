#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int N,i=0;
  cin>>N;
  for(i=1;i<=N;i++)
  {
    if(i%2==0)
      cout<<i*i-2<<" ";
    else
      cout<<i*i-1<<" ";
  }
}