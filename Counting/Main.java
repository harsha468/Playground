#include <iostream>
using namespace std;

int main()
{
    char l[200];
    int v=0,c=0,d=0,w=0,s=0;
    cin.getline(l,200);
    for(int i=0;l[i]!='\0';i++)
    {
        if(l[i]=='a'||l[i]=='e'||l[i]=='i'||l[i]=='o'||l[i]=='u'||l[i]=='A'||l[i]=='E'||l[i]=='I'||l[i]=='O'||l[i]=='U')
        {
            v++;
        }
        else if((l[i]>='a'&& l[i]<='z') || (l[i]>='A'&& l[i]<='Z'))
        {
            c++;
        }
        else if(l[i]>='0'&&l[i]<='9')
        {
            d++;
        }
        else if(l[i]==' ')
        {
            w++;
        }
      else
      	{
        	s++;
      	}
    }
    cout<<"Vowels:"<<v<<"\n";
    cout<<"Consonants:"<<c<<"\n";
    cout<<"White Spaces:"<<w<<"\n";
    cout<<"Digits:"<<d<<"\n";
   	cout<<"Symbols:"<<s<<"\n";
    return 0;
}