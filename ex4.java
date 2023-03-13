public class ex4 {
    private String name; 
    private double price; 


    public void setName(String name){
        this.name=name; 
    }

    public void setPrice(double price){
        this.price=price; 
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price; 
    }

    public void display(){
        System.out.printf("You ordered %s and the price is %.2f\n",getName(), getPrice()); 
    }

    
}
