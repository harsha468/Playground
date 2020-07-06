#include<iostream>
using namespace std;
int main()
{
  int a,n,p=1;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  for(int i=0;i<n;i++)
  {
    p=p*a;
  }
  cout<<"The value of "<<a<<" power "<<n<<" is "<<p;
}