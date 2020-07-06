#include<iostream>
using namespace std;
int main()
{
  int N;
  cin>>N;
  int a[N],e=0,o=0;
  for(int i=0;i<N;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      e+=a[i];
    else
      o+=a[i];
  }
cout<<"The sum of the even numbers in the array is "<<e<<"\n";
cout<<"The sum of the odd numbers in the array is "<<o;  
}