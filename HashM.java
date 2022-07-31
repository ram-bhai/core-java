import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class HashM {
    public static void main(String args[]){
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Bhopal");
        hm.put(2, "Indore");
        hm.put(3,"Ujjain");
        hm.put(4,"Hoshangabad");
        hm.put(5,"Rewa");
        Set<Map.Entry<Integer,String>> s = hm.entrySet();
        
        for(Map.Entry<Integer,String> entry : s)
        System.out.println(entry.getKey()+""+entry.getValue());
    }
    
}
