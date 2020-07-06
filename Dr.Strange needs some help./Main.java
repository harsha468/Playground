#include <iostream>
#include <math.h> 
using namespace std;
int fun(int,int);
int fun(int x, int y)
{
    return pow(x,y);
}
int main()
{
    int x,y,z;
    cin>>x;
    cin>>y;
    cin>>z;
    x=fun(x,y);
  if(z>x)
    std::cout <<"Sorry Doctor! You need more bacteria.";
  else
    cout<<"Doctor, you can proceed with your experiment.";
    return 0;
}