import java.util.Scanner; 

public class ex4main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        String name; 
        double price; 

        for(int i = 1; i <=2; i++){
            ex4 j1 = new ex4(); 
            System.out.println("Detail #"+i); 
            System.out.print("Enter product name: "); 
            name = input.next(); 
            j1.setName(name);
            System.out.print("Enter price: "); 
            price = input.nextDouble(); 
            j1.setPrice(price);
            j1.display();
            input.nextLine(); 

        }
    }
}
