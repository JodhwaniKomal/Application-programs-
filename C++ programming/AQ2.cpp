#include<iostream>
using namespace std;

class Base
{
    public :
    int i;
    float f;
    
    
     void fun()
    {
        cout<<"Inside Base fun"<<"\n";
    }
     
     virtual void gun()
     {
        cout<<"Base Gun";
     }
};
class derived:public Base
{
    public:
    int i;
    double d;
     
     virtual void fun()
     {
        cout<<"inside derived fun";
     }

     void gun()
     {
        cout<<"Derived gun";
     }

    virtual void sun()
      {
        cout<<"derived sun";
      }
};
 
int main()
{
    Base *bp=new derived;
    bp->gun();
    bp->fun();
    
        
        return 0;
}