package cdapp;
public class MovieCD extends CD{
    String duration;

    public MovieCD(String duration, String title, int CDNO, double cost, int stolkLevel) {
        super(title, CDNO, cost, stolkLevel);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public void buy(Customer cust) {
        String[] order = cust.getOrder();
        //cust
        String coOrders = "[";
        for(String el:order){
        coOrders = coOrders + el;
        }
        System.out.print("]");
        System.out.println("***MovieCD order***\n" + cust.getName() + " " + coOrders + " " + cust.getOrdercost() + " " + cust.getTelephone());
    }

   
    @Override
    public String toString() {
        //extracting a string from duration, then convert it to an interger and then convert hours to minutes
        String strHours = duration.substring(0,duration.indexOf("h"));
            try{
                //am trying to convert the string extracted("2") to an integer,calculating the minutes in an hour and then converting it back to a string.
                int intHours = Integer.valueOf(strHours);
                int minutes = intHours*60;
                duration = String.valueOf(minutes);
            }catch(Exception e){
                System.out.println("Some thing went wrong when convrting hours to mintes. inform the devloper");
            
            }
          
        return (super.getCDNO() + ". " + super.getTitle() + " " + duration  + "mins " +super.getCost() + " " + super.getStolkLevel()+ " CDs left.");
    }
    
    
}
