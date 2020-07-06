#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int F,FD,FS,S,SD,SS,A,AD,AS;
  cin>>F;
  cin>>FD;
  cin>>FS;
  cin>>S;
  cin>>SD;
  cin>>SS;
  cin>>A;
  cin>>AD;
  cin>>AS;
  int x,y,z,m;
  x=F-(F*FD/100)+FS;
  y=S-(S*SD/100)+SS;
  z=A-(A*AD/100)+AS;
  cout<<"In Flipkart Rs."<<F-(F*FD/100)+FS<<"\n";
  cout<<"In Snapdeal Rs."<<S-(S*SD/100)+SS<<"\n";
  cout<<"In Amazon Rs."<<A-(A*AD/100)+AS<<"\n";
  if (!(y / x))  
        m=(!(y / z)) ? y : z; 
  else
    m=(!(x / z)) ? x : z;
  if (m==x)
    cout<<"He will prefer Flipkart";
  else if(m==y)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}