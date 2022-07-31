import java.util.*;
class Collection5{
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<String>();
        al.add("cheeku");
        al.add("Raju");
        al.add("Shyam");

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("cheeku");
        al2.add("mohit");
        al2.add("sumit");

        ArrayList<String> al3=new ArrayList<String>();
        al3.add("cheeku");
        al3.add("santa");
        al3.add("banta");

        al.addAll(al3);
        al.addAll(al2);
        System.out.println(al);
        System.out.println(al.size());

        al.removeAll(al2);
        System.out.println(al);
        System.out.println(al.size());

        al.removeAll(al3);
        System.out.println(al);
        System.out.println(al.size());


    }
    
}
