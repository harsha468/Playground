#include<iostream>
using namespace std;
int main()
{
  int N,i,j;
  cin>>N;
  for(i=1;i<=N;i++)
  {
    for(j=1;j<=N;j++)
    {
      if(i%2==1)
      {
        if(j==N)
          cout<<i+1;
        else
          cout<<i;
      }
      else
      {
        if(j==1)
          cout<<i+1;
        else
          cout<<i;
      }
    }
    cout<<"\n";
  }
}