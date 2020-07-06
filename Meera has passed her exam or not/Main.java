#include<iostream>
using namespace std;
int main()
{
  int N,M,c=0;
  cin>>N;
  int a[N];
  for(int i=0;i<N;i++)
    cin>>a[i];
  cin>>M;
  for(int i=0;i<N;i++)
  {
    if(a[i]==M)
    {
      cout<<"She passed her exam";
      c=1;
      break;
    }
  }
  if(c==0)
    cout<<"She failed";
}