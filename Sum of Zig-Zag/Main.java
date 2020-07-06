#include<iostream>
using namespace std;
int main()
{
  int N,M,sum=0,dia=0;
  cin>>N;
  cin>>M;
  int arr[N][M];
  for (int i=0;i<N;i++)
  {
    for(int j=0;j<M;j++)
    {
      cin>>arr[i][j];
      if((i==0) or (i==N-1))
        sum+=arr[i][j];
    }
  }
  for (int i=0;i<N;i++)
  {
    dia+=arr[i][N-i-1];
  }
cout<<"Sum of Zig-Zag pattern is "<<sum+dia-arr[0][M-1]-arr[N-1][0]<<"\n";
}