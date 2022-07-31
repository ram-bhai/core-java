import java.util.ArrayList;
class Collection3{
    public static void main(String args[]){
        ArrayList <Integer> al = new ArrayList<Integer>(5);
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(30);
        al.add(40);
        al.add(20);
        System.out.println(al);
        System.out.println("Total Elements : "+al.size());
    }
    
}
