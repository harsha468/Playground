#include<iostream>
#include<string>
using namespace std;
int main()
{
  string st;
  getline(cin,st);
  for(int i=0;i<st.length();i++)
  {
    if(st[i]=='t' and st[i+1]=='h' and st[i+2]=='e' and st[i+3]==' ')
    {
      st.erase(i,4);
    }
  }
  cout<<st;
}