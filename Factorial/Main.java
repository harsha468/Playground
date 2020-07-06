#include<iostream>
using namespace std;
int main()
{
  int N,fact=1;
  cin>>N;
  for(int i=N;i>0;i--)
    fact=fact*i;
  cout<<"The factorial of "<<N<<" is "<<fact;
}