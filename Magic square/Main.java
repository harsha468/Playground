#include<iostream>
using namespace std;
int main()
{
  int a=0,b=0,N;
  cin>>N;
  int arr[N][N];
  for (int i=0;i<N;i++)
  {
    for(int j=0;j<N;j++)
      cin>>arr[i][j];
  }
  for (int i=0;i<N;i++)
  {
    a+=arr[i][i];
    b+=arr[i][N-i-1];
  }
  if(a==b)
    cout<<"Yes";
  else
    cout<<"No";
}