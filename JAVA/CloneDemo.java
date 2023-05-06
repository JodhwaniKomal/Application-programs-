class CloneDemo 
{
    public static void main (String A[])
  {
    try {
    Student obj = new Student("Komal",87,27);
    Student onj2 = (Student)obj
} 
catch()
{

}

}
class Student implements Cloneable
{
    public String name;
    public int marks;
    public int age;

    public Student(String str,int a,int b)
    {
      this.name = str;
      this.marks = a;
      this.age = b;
    }
    public Object clone() throws Exception
    {
        return super.clone();

    }
}