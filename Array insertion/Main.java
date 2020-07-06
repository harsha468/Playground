#include<iostream>
using namespace std;
int main()
{
  int N;
  cout<<"Enter the number of elements in the array\n";
  cin>>N;
  int a[N+1];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<N;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  int I;
  cin>>I;
  if(I>N)
    cout<<"Invalid Input";
  else
  {
    int e;
    cout<<"Enter the value to insert\n";
    cin>>e;
    for(int i=N;i>=I;i--)
    {
      a[i]=a[i-1]; 
    }
    a[I-1]=e;
    cout<<"Array after insertion is\n";
  for(int i=0;i<N+1;i++)
  {
    cout<<a[i]<<"\n";
  }
  }
}