#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float M;
  int L,D;
  cin>>M;
  cin>>L;
  cin>>D;
  if(M*L<D)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}