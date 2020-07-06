#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int W,A,C;
  int T;
  cin>>W;
  cin>>A;
  cin>>C;
  T=A*75+C*30;
  if(T<=W)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}