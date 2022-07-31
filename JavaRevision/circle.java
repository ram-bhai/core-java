import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter radius of circle :");
        float radius = sc.nextFloat();
        sc.close();
        float area = pi*radius*radius;
        System.out.println(area);
    }
    
}
