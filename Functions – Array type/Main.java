#include<iostream>
using namespace std;
int main()
{
  int N,e=0,o=0;
  cout<<"Enter the number of elements in the array\n";
  cout<<"Enter the elements in the array\n";
  cin>>N;
  int a[N];
  for (int i=0; i<N;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      e++;
    else
      o++;
  }
  if(e==0)
    cout<<"The array is Odd";
  else if(o==0)
    cout<<"The array is Even";
  else
    cout<<"The array is Mixed";
}