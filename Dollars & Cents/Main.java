#include<iostream>
using namespace std;
int main()
{
  int N1,N2,N3,N4;
  cin>>N1;
  cin>>N2;
  cin>>N3;
  cin>>N4;
  cout<<N1+N3+(N2+N4)/100<<"\n";
  cout<<(N2+N4)%100;
}