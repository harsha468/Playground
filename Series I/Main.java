#include<iostream>
using namespace std;
int main()
{
  int N;
  cin>>N;
  float i=0.5;
  int k;
  float n;
  n=i;
  cout<<n<<" ";
  for(k=1;k<N;k++)
  {
    n=3*n;
    cout<<n<<" ";
  }
  
}