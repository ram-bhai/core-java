import java.util.TreeSet;
import java.util.HashMap;
import java.util.Collection;
class Assign implements Comparable {
    private String state;
    private String city;
    

    public Assign(String state,String city){
        this.state = state;
        this.city = city;
    }
    public Assign(){}

    public void setState(String state){
        this.state = state;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getState(){
        return state;
    }
    public String getCity(){
        return city;
    }
    @Override
    public int compareTo(Object o) {
        
        if (this.o == o){
            return 1;
        }
        else if(this.o >o){
            return -1;
        }
    }
}
class TestMain{
    public static void main(String args[]){
        TreeSet<String> s = new TreeSet<String>();
        s.add("Dehradun");
        s.add("Bhopal");
        s.add("Mumbai");
        s.add("Delhi");
        s.add("Punjab");
        s.add("Kolkata");

        for(String ele : s)
        System.out.println(ele);
    }
    
}
