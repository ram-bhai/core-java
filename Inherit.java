/*8) Create a class Student with two members : rollno and percentage.
	Create default and parameterized constructors. 
    Create method show() to 	display information.
	Create another class CollegeStudent inherits Student class.
     Add a new membersemester to it. Create default and parameterized constructors.
      Also override show() method.
	Create another class SchoolStudent inherits Student class.
     Add a new memberclassname(eg 12 th ,10 th etc.) to it. Create default and parameterized constructors.
      Also override show() method.
	Create a class(say XYZ) with main method that carries out the operation of the project :
•	has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
•	create two CollegeStudent and three SchoolStudent record objects and store 	them inside the array.
•	display all record from the array.
•	search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
•	count how many students are having A grade,if for A grade percentage >75.

*/

class Student{
    public int roll=1001;
    public float per=70;
    public Student(){}
    public Student (int roll,float per)
    {
        this.roll=roll;
        this.per=per;
    }
    public void show()
    {
        System.out.println("Roll number : "+roll);
        System.out.println("Percentage : "+per);
    }
}

class CollegeStudent extends Student 
{
    public int semester=2;
    public CollegeStudent(){}
    public CollegeStudent(int semester)
    {
        this.semester = semester;
    }
    public void show()
    {
        System.out.println("Roll number : "+roll);
        System.out.println("Percentage : "+per);
        System.out.println("Semester : "+semester);
    }
}

class SchoolStudent extends Student
{
  public int classname;

   public SchoolStudent(){}
   public SchoolStudent(int classname)
   {
     this.classname=classname; 
   } 
   public void show()
   {
       System.out.println("Roll number : "+roll);
       System.out.println("Percentage : "+per);
       System.out.println("Classname : "+classname);
   }    

}

class Xyz
{
    public static void main(String args[])
    {
        Student obj = new SchoolStudent();
        obj.show();
    }
}