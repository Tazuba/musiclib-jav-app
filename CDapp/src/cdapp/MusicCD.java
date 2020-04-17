package cdapp;
public class MusicCD extends CD{
    private String[] songs;

    public MusicCD(String[] songs, String title, int CDNO, double cost, int stolkLevel) {
        super(title, CDNO, cost, stolkLevel);
        this.songs = songs;
    }

    public String[] getSongs() {
        return songs;
       
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }

    

    @Override
 public void buy(Customer cust) {
        String[] songs = cust.getOrder();
        String coSongs = "[";
        for(String el:songs){
        coSongs = coSongs + el + ",";
        }
        System.out.println("***MusicCD order***\n" + cust.getName() + " " + coSongs + "] " + cust.getOrdercost() + " " + cust.getTelephone());
    }
 
 
    @Override
    public String toString() {
        
        return (super.getCDNO() + ". " + super.getTitle() + " songs on CD [" +  songs[0] +","+ songs[1]  + "] " +super.getCost() + " " + super.getStolkLevel()+ " CDs left.");
    }
}
