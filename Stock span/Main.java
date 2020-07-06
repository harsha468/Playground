#include<iostream>
using namespace std;
int main()
{
  int N;
  cin>>N;
  int a[N];
  for(int i=0;i<N;i++)
  {
    cin>>a[i];
  }
  cout<<"1"<<"\n";
  int c=1;
  for(int i=1;i<N;i++)
  {
    if(a[i]>a[i-1])
    {
      cout<<2*c<<"\n";
      c++;
    }
    if(a[i]<a[i-1])
      cout<<"1"<<"\n";
  }
}