import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Agefounder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter your date of birth in [dd/mm/yyyy] format.");
        java.lang.String dateOfBirth = sc.nextLine();
        sc.close();
        String arr[] = dateOfBirth.split( "/");
        int d = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);

        LocalDate d1 = LocalDate.of(y, m, d);
        LocalDate d2 = LocalDate.now();
        Period p = Period.between(d1, d2);
        System.out.println("Your age is : "+ p.getYears()+" Years "+ p.getMonths()+" Months "+ p.getDays()+" Days.");
    }
    
}
