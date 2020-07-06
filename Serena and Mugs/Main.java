#include<iostream>
using namespace std;
int main()
{
  int n,s;
  cin>>n;
  cin>>s;
  int a[n],sum=0;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    sum+=a[i];
  }
    if(sum>s)
      cout<<"NO";
  else
    cout<<"YES";
}