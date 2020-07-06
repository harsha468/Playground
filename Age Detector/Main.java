#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int B,C;
  cin>>B;
  cin>>C;
  if(B>=C)
    cout<<(100+C)-B;
  else
    cout<<C-B;
}