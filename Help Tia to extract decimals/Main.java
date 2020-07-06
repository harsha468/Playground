#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string fnum;
    cin>>fnum;
	string s;
    int p;
    p=fnum.find(".");
  if(p>0)
  {
    s=fnum.substr(p+1);
  cout<<"Floating part is : "<<s;
  }
  else
    cout<<"Floating part is : ";
}