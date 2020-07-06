#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  int a,b,c,d;
  cin>>a;
  cin>>b;
  cin>>c;
  cin>>d;
  int g,h;
  if(x==1)
  {
    g=a+c;
    h=b+d;
    if(h<0)
    cout<<g<<h<<"i";
  else
    cout<<g<<"+"<<h<<"i";
  }
  else if(x==2)
  {
    g=a-c;
    h=b-d;
    if(h<0)
    cout<<g<<h<<"i";
  else
    cout<<g<<"+"<<h<<"i";
  }
  else if(x==3)
  {
    g=a*c-b*d;
    h=a*d+b*d;
    if(h<0)
    cout<<g<<h<<"i";
  else
    cout<<g<<"+"<<h<<"i";
  }
  else
    cout<<"Invalid choice";
}