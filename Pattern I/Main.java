#include<iostream>
using namespace std;
int main()
{
  int N,i=0,j=1,c=1;
  cin>>N;
  for(i=N;i<=N+3;i++)
  {
    for(j=1;j<=c;j++)
    {
      cout<<i<<"";
    }
    c++;
    cout<<"\n";
  }
  int k=4;
  for(i=N+3;i>=N;i--)
  {
    for(j=k;j>=1;j--)
    {
      cout<<i<<"";
    }
    cout<<"\n";
   k--; 
  }
}