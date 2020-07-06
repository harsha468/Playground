#include<iostream>
using namespace std;
int main()
{
  int N,m=0,f=0;
  cin>>N;
  int a[N];
  for(int i=0;i<N;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      m++;
    else
      f++;
  }
  cout<<f<<"\n";
  cout<<m;
}