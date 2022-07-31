//Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
import java.util.Scanner;
class Students{
  private String name;
  private int rollNo,age,score;
  private int group;
  
  public void setName(String name){
    this.name = name;
  }
  
  public void setRollNo(int rollNo){
    this.rollNo = rollNo;
  }
  
  public void setAge(int age){
    this.age = age;
  }
  
  public void setScore(int score){
    this.score = score;
  }
  
  public int getScore(){
    return score;
  }
  
  public String getName(){
    return name;
  }
  
  public int getAge(){
    return age;
  }
  
  public int getRollNo(){
    return rollNo;
  }
  
  public void setGroup(int group){
    this.group = group;
  }
  
  public int getGroup(){
		return group;
  }
}

class Test{
  public static void main(String args[]){
    Students s[] = new Students[2];
    Scanner scan = new Scanner(System.in);
    String name;
    int rollNo,age,score;
    for(int i=0;i<s.length;i++){
      s[i] = new Students();
      System.out.print("Enter the name : ");
      s[i].setName(scan.next());
      System.out.print("Enter the roll no : ");
      s[i].setRollNo(scan.nextInt());
      System.out.print("Enter the Age : ");
      s[i].setAge(scan.nextInt());
      System.out.print("Enter the Score : ");
      s[i].setScore(scan.nextInt());
    }  
    Students temp = new Students();
		int flag = 0;
    for(int i=0;i<s.length;i++){
      for(int j=i+1;j<s.length;j++){
		    if(s[i].getScore()>s[j].getScore()){
		      temp = s[i];
		      s[i]=s[j];
		      s[j]=temp;
		    }
		  }
		  if(s[i].getScore()<=50){
		        s[i].setGroup(1);
		      }
		      else if(s[i].getScore()<=65){
		        s[i].setGroup(2);
		      }
		      else if(s[i].getScore()<=85){
		        s[i].setGroup(3);
		      }
		      else if(s[i].getScore()<=100){
		        s[i].setGroup(4);
		      }
    }
    for(int i=0;i<s.length;i++){
      if(s[i].getGroup()==1){
        System.out.println("Students who get Marks Between 0-50");
        System.out.println("Name : " + s[i].getName());
		    System.out.println("Roll no : " + s[i].getRollNo());
		    System.out.println("Age : " + s[i].getAge());
		    System.out.println("Score : " + s[i].getScore());
      }
      else if(s[i].getGroup()==2){
        System.out.println("Students who get Marks Between 50-65");
        System.out.println("Name : " + s[i].getName());
		    System.out.println("Roll no : " + s[i].getRollNo());
		    System.out.println("Age : " + s[i].getAge());
		    System.out.println("Score : " + s[i].getScore());
      }
      else if(s[i].getGroup()==3){
        System.out.println("Students who get Marks Between 65-80");
        System.out.println("Name : " + s[i].getName());
		    System.out.println("Roll no : " + s[i].getRollNo());
		    System.out.println("Age : " + s[i].getAge());
		    System.out.println("Score : " + s[i].getScore());
      }
      else if(s[i].getGroup()==4){
        System.out.println("Students who get Marks Between 80-100");
        System.out.println("Name : " + s[i].getName());
		    System.out.println("Roll no : " + s[i].getRollNo());
		    System.out.println("Age : " + s[i].getAge());
		    System.out.println("Score : " + s[i].getScore());
      }
    }
  }
}
