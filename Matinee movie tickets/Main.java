#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int A;
  float T;
  cin>>A;
  cin>>T;
  float m=13.3;
  if(A>13)
  {
    if (T==m){
      cout<<"$5.00";
    }
    else{
      cout<<"$8.00";
    }
  }
  else
  {
    if (T==m)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
}