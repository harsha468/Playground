#include<iostream>
using namespace std;
int main()
{
  int N,max=0;
  cin>>N;
  int a[N];
  for(int i=0;i<N;i++)
  {
    cin>>a[i];
    if(a[i]>max)
      max=a[i];
  }
  cout<<max;
}