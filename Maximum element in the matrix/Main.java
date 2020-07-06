#include<iostream>
using namespace std;
int main()
{
  int R,C;
  cin>>R;
  cin>>C;
  int a[R][C],max=0;
  for (int i=0;i<R;i++)
  {
    for(int j=0;j<C;j++)
    {
      cin>>a[i][j];
      if(a[i][j]>max)
        max=a[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
}