#include<iostream>
#include <cmath>
using namespace std;
int main()
{
  int R,L;
  cin>>R;
  cin>>L;
  if(2*R<=L)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}