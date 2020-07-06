#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int R,C,N;
  cin>>R;
  cin>>C;
  cin>>N;
  if (((N>R) && (N<=2*R)) || ((N>((C*R)-2*R)) && (N<=C*R-R)))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}