#include<iostream>
using namespace std;
int main()
{
    int a,b,x;
    cout<<"Enter first number : ";
    cin>>a;
    cout<<"Enter second number : ";
    cin>>b;
    cout<<"Menu\n";
    cin>>x;
   std::cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
    
  if(x<=5)
  {
    switch(x)
    {
      case 1 : std::cout<<a+b;
        break;
        case 2 : std::cout<<a-b;
        break;
        case 3 : std::cout<<a*b;
        break;
        case 4 : std::cout<<a/b;
        break;
        case 5 : std::cout<<a%b;
        break;
    }  
    }
  else
    cout<<"Invalid operation";
}