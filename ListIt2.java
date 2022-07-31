import java.util.ArrayList;
import java.util.ListIterator;
class student{
    public static void main(java.lang.String args[]){
        ArrayList<Object> al = new ArrayList<Object>();
        al.add(100);
        al.add(200);
        al.add("Cheeku");
        al.add("Naman");
        al.add(3.14f);
        al.add(3.15);
        al.add(400);
        al.add("Samar");
        ListIterator<Object> ll = al.listIterator();
        System.out.println("forward traversing of Data....");
        System.out.println("...............................");
        while(ll.hasNext()){
            Object o = ll.next();
            System.out.println(o);
        }
        ListIterator<Object> ll2 = al.listIterator(al.size());
        System.out.println("Backward traversing of Data....");
        System.out.println("...............................");
        while(ll2.hasPrevious()){
            Object s = ll2.previous();
            System.out.println(s);
        }
    }
}