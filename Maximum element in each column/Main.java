#include<iostream>
using namespace std;
int main()
{
  int N,M;
  cin>>N;
  cin>>M;
  int arr[N][M];
  for (int i=0;i<N;i++)
  {
    for(int j=0;j<M;j++)
    {
      cin>>arr[i][j];
    }
  }
  for(int i=0;i<M;i++)
  {
    int max=0;
    for(int j=0;j<N;j++)
    {
      if(arr[j][i]>max)
        max=arr[j][i];
    }
    cout<<max<<"\n";
  }
}