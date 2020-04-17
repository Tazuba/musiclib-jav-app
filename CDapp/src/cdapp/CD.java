package cdapp;
public abstract class CD {
    private String title;
    private int CDNO;
    private double cost;
    private int stolkLevel;

    public CD(String title, int CDNO, double cost, int stolkLevel) {
        this.title = title;
        this.CDNO = CDNO;
        this.cost = cost;
        this.stolkLevel = stolkLevel;
    }

    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }

    public int getCDNO() {
        return CDNO;
    }

    public void setCDNO(int CDNO) {
        this.CDNO = CDNO;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStolkLevel() {
        return stolkLevel;
    }

    public void setStolkLevel(int stolkLevel) {
        this.stolkLevel = stolkLevel;
    }
    
    public abstract void buy(Customer cust);
    public String borrow(String title,int stolkLevel){
       String message = "You can not borrow CD: " + title;   
        if(stolkLevel > 2){
            message = "You can  borrow CD: " + title;;
        }
     return message;
    }
    
    public void returnCD(String title,int stolkLevel){
        this.stolkLevel++;
        System.out.println("Returned CD: " + title);
    }
    
    
    
}
