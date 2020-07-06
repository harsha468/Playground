#include<iostream>
using namespace std;
int main()
{
  int R,C;
  cin>>R;
  cin>>C;
  int a[R][C],b[R][C];
  for (int i=0;i<R;i++)
  {
    for(int j=0;j<C;j++)
      cin>>a[i][j];
  }
  for (int i=0;i<C;i++)
  {
    for(int j=0;j<R;j++)
    {
      cout<<a[j][i]<<" ";
    }
  cout<<"\n";
  }
}