// Create a class Student with two members : rollno and percentage.
// 	Create default and parameterized constructors. Create method show() to 	display information.
// 	Create another class CollegeStudent inherits Student class. Add a new membersemester to it. Create default and parameterized constructors. Also override show() method.
// 	Create another class SchoolStudent inherits Student class. Add a new memberclassname(eg 12 th ,10 th etc.) to it. Create default and parameterized 	constructors. Also override show() method.
// 	Create a class(say XYZ) with main method that carries out the operation of the project :
//     • has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
//     • create two CollegeStudent and three SchoolStudent record objects and store 	them inside the array.
//     • display all record from the array.
//     • search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
//     • count how many students are having A grade,if for A grade percentage >75.

class Student{
    protected int rollNo,percentage;
    public Student(){}
    public Student(int rollNo, int percentage){
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    public void show(){
        System.out.println("Roll No : " + rollNo);
        System.out.println("Percentage : " + percentage);
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setPercentage(int percentage){
        this.percentage = percentage;
    }
    public int getRollNo(){
        return rollNo;
    }
    public int getPercentage(){
        return percentage; 
    }
}

class CollegeStudent extends Student{
    int semester;
    public CollegeStudent(){}
    public CollegeStudent(int rollNo,int percentage,int semester){
        super(rollNo,percentage);
        this.semester = semester;
    }
    public void show(){
        super.show();
        System.out.println("Semester : " + semester);
    }
}

class SchoolStudent extends Student{
    int tenth,twelvth;
    public SchoolStudent(){}
    public SchoolStudent(int rollNo,int percentage,int semester){
        super(rollNo,percentage);
        this.semester = semester;
    }
    public void show(){
        super.show();
        System.out.println("Semester : " + semester);
    }
    
}