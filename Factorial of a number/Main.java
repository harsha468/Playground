#include<iostream>
using namespace std;
int main(){
  int i,n;
  cin>>n;
  int m=1;
  for(i=n;i>=1;i--)
  {
    m=m*i;
  }
  cout<<m;
}