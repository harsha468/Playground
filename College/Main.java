#include<iostream>
using namespace std;
int main()
{
  int N;
  cout<<"Enter the number of colleges\n";
  cin>>N;
  for(int i=1;i<N+1;i++)
  {
    cout<<"Enter the details of college "<<i<<"\n";
    cout<<"Enter name\n";
    cout<<"Enter city\n";
    cout<<"Enter year of establishment\n";
    cout<<"Enter pass percentage\n";
  }
  cout<<"Details of colleges\n";
  for(int i=1;i<=N;i++)
  {
    char s[50],st[50];
    int y;
    float p;
    cin>>s;
    cin>>st;
    cin>>y;
    cin>>p;
    cout<<"College:"<<i<<"\n";
    cout<<"Name:"<<s<<"\n";
    cout<<"City:"<<st<<"\n";
    cout<<"Year of establishment:"<<y<<"\n";
    cout<<"Pass percentage:"<<p<<"\n";
  }
}