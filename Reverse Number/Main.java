#include <iostream>
using namespace std;
int main() 
{
	int n,r,R=0;
    cin>>n;
    while(n!=0)
    {
      r=n%10;
      R=R*10+r;
      n=n/10;
    }
  cout<<R;
}