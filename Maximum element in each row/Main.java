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
    int max=0;
    for(int j=0;j<M;j++)
    {
      cin>>arr[i][j];
      if(arr[i][j]>max)
        max=arr[i][j];
    }
    cout<<max<<"\n";
  }
}