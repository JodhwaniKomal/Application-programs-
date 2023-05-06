using namespace std;
#include<iostream>

template<class T>
T AdditionI(T i,T j)
{
    T result;
    result = i+j;
    return result;
}

int main()
{
   int i;
   float f;
   double d;

   i = AdditionI(10,11);
   cout<<i<<"\n";
   f = AdditionI(10.7f,89.5f);
   cout<<f<<"\n";
   d = AdditionI(10.8,70.8);
   cout<<d<<"\n";
   return 0;
}