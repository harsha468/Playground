#include<iostream>
#include <cmath> 
using namespace std;
int main()
{
  float I1,I2,I;
  int F1,F2,F;
  cin>>F1;
  cin>>I1;
  cin>>F2;
  cin>>I2;
  I=I1+I2;
  F=F1+F2;  
  if(I>12)
  {
    F++;
    I-=12;
  }
  cout<<F<<"'-";
  cout<<I<<'"';
}