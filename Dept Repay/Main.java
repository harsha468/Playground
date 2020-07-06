#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float i;
  cin>>p;
  cin>>r;
  cin>>t;
  i=p*t*r/100;
  cout<<i<<"\n";
  cout<<p+i<<"\n";
  cout<<2*i/100<<"\n";
  cout<<(p+i)-(2*i/100);
}