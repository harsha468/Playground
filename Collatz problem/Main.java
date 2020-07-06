#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  cin>>n;
  while (n != 1) 
    { 
        cout << n << "\n"; 
        if (n & 1) {
            n = 3*n + 1;
            c++;}
        else{
            n = n/2;
            c++;} 
    } 
    cout << n<<"\n"; 
  cout<<c;
}