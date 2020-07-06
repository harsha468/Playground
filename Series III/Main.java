#include<iostream>
using namespace std;
int main()
{
  int N;
  cin>>N;
  int k=6,i=0;
  int n=k;
  for(i=0;i<N*5;i+=5)
  {
    n=n+i;
    cout<<n<<" ";
  }
}