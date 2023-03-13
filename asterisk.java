public class asterisk {
    private int rows; 

    public asterisk(int rows){
        this.rows=rows; 
    }

    public int getRows(){
        return rows; 
    }

    public void forRows(){
        for(int i = 1; i <= getRows(); i++){
            for(int j = i; j <= getRows(); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void forRows2(){
        for(int i = 1; i<=getRows(); i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*"); 
            }
            System.out.println(""); 
        }
    }
}
