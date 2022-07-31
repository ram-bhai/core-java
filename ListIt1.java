import java.util.ArrayList;
import java.util.ListIterator;
class User{
    public static void main(java.lang.String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        ListIterator<Integer> lit = al.listIterator();
        System.out.println("Forward data traversing....");
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("Backward data traversing....");
        System.out.println("-------------------------");
        ListIterator<Integer> lit2 = al.listIterator(al.size());
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
            
        }
    }
}