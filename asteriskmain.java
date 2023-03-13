import java.util.Scanner;

public class asteriskmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int rows; 

        System.out.print("Enter rows: "); 
        rows = input.nextInt(); 

        asterisk j1 = new asterisk(rows); 
        j1.forRows();
        j1.forRows2();
    }
}
