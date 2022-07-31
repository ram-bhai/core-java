// Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
//  Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated   on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method   in   above   classes   to  display faculty data. 
//  Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details.
class Faculty{
    protected int facultyId,salary;
}
class FullTimeFaculty extends Faculty{
    private int basic,allowance;
    public void input(int facultyId,int basic,int allowance){
        this.facultyId = facultyId;
        this.basic = basic;
        this.allowance = allowance;
        salary = basic + allowance;
    }
    public void display(){
        System.out.println("Faculty ID : " + facultyId);
        System.out.println("Salary : " + salary);
    }
}
class PartTimeFaculty extends Faculty{
    private int hour,rate;
    public void input(int facultyId,int hour,int rate){
        this.facultyId = facultyId;
        this.hour = hour;
        this.rate = rate;
        salary = hour * rate;
    }
    public void display(){
        System.out.println("Faculty ID : " + facultyId);
        System.out.println("Salary : " + salary);
    }
}
class Main{
    public static void main(String args[]){
        FullTimeFaculty ft1 = new FullTimeFaculty();
        FullTimeFaculty ft2 = new FullTimeFaculty();

        PartTimeFaculty pt1 = new PartTimeFaculty();
        PartTimeFaculty pt2 = new PartTimeFaculty();

        ft1.input(101,25000,5000);
        ft2.input(102,35000,2000);
        
        pt1.input(103,192,120);
        pt2.input(104,192,100);

        System.out.println();
        ft1.display();

        System.out.println();
        ft2.display();

        System.out.println();
        pt1.display();

        System.out.println();
        pt2.display();
        
    }
}
