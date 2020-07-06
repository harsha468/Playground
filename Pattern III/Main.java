#include<iostream>
using namespace std;
int main()
{
  int N,i=1,j=1;
  cin>>N;
  for(i=1;i<=N;i++)
  {
    for(j=1;j<i;j++)
    {
      cout<<i<<"*";
    }
    cout<<i<<"\n";
  }
  for(i=N;i>=1;i--)
  {
    for(j=1;j<i;j++)
    {
      cout<<i<<"*";
    }
    cout<<i<<"\n";
  }
}