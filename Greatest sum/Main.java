#include<iostream>
using namespace std;
int main()
{
  int N,M;
  cin>>N;
  cin>>M;
  int arr[N][M],sumr,sumc,maxr=0,maxc=0,r,c;
  cout<<"Sum of rows is ";
  for (int i=0;i<N;i++)
  {
    sumr=0;
    for(int j=0;j<M;j++)
    {
      cin>>arr[i][j];
      sumr+=arr[i][j];
    }
    if(sumr>maxr)
    {
      maxr=sumr;
      r=i+1;
    }
    cout<<sumr<<" ";
  }
  cout<<"\nRow "<<r<<" has maximum sum";
  cout<<"\nSum of columns is ";
  for(int i=0;i<M;i++)
  {
    sumc=0;
    for(int j=0;j<N;j++)
    {
        sumc+=arr[j][i];
    }
    if(sumc>maxc)
    {
      maxc=sumc;
      c=i+1;
    }
    cout<<sumc<<" ";
  }
  cout<<"\nColumn "<<c<<" has maximum sum";
}