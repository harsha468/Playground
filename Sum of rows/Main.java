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
    int sum=0;
    for(int j=0;j<M;j++)
    {
      cin>>arr[i][j];
        sum+=arr[i][j];
    }
    cout<<sum<<"\n";
  }
}