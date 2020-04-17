package cdapp;
import java.util.ArrayList;
import java.util.Scanner;
public class CDapp {
    public static void main(String[] args) {
         /*
        1. This method  main method cantains
            calls to staict method 
            paformin differe tasks
        */
                printObjectsdata(); //print data withing objects using to string methods
                menu(); //displaying the menu
                
    }//close main function
    
    //method for print objects data
    public static void printObjectsdata(){
        String[]songs ;
        String[]songs2;
        MusicCD obj1 = new MusicCD(songs = new String[]{"A Dream is a Wish","The Kings Plan"},"Cinderella", 101, 5000, 4);
        MusicCD obj2 = new MusicCD(songs2 = new String[]{"Wale Wale"," Ba Yuda","Moto Moto"},"Chameleon Collection", 102, 3500, 6);
        
        //creating objects for MovieCDs
        MovieCD MovieObj1 = new MovieCD("2hrs", "Die Hard two", 301, 3500, 8);
        MovieCD obj4 = new MovieCD("4hrs", "Crazy Wedding", 302, 4000, 3);
        MovieCD obj5 = new MovieCD("3hrs", "Mind your Language", 303, 4500, 3);
        
        //An Arraylist to hold objects created.
        ArrayList<CD> collections = new ArrayList<CD>();
        collections.add(obj1);
        collections.add(obj2);
        collections.add(MovieObj1);
        collections.add(obj4);
        collections.add(obj5);
        //comparision between an array and ArrayList is attached in a word document.
        
        //Dispalying data
        System.out.println("Music Cds\n===========================\n" + obj1.toString()+ "\n" + obj2.toString() );
        System.out.println("movie CDs\n============================\n" + MovieObj1.toString()+ "\n" + obj4.toString()+ "\n" +obj5.toString()+ "\n");
        
    }
    

    //method for displaying the menue.
    public static void menu(){
        System.out.println("CDLibrary Application Menu\n" + "=======================================");
        System.out.println("1.Borrow\n" + "2.Return\n" + "3.Buy Music CD\n" + "4.Buy Movie CD\n" + "0.Exit\n");
        System.out.println("Enter Menu Option:");
        int menuOption = 0; 
        Scanner Option = new Scanner(System.in);
        menuOption = Option.nextInt();
        
        switch(menuOption){
            case 1:
                Borrow();
            break;
            case 2:
                ReturnedCD();
            break;
            case 3:
                BuyCD();
                musicOrder();
            break;
            case 4:
                BuyCD();
                movieOrder();
            break;
            case 0:
                System.out.println("App closed. Thank you");
                System.exit(0);
                
            break;
            default:
                System.out.println("Select a collect option");
            break;
                
        }
        
    }//clossing menue method.
    
    
    //method for case buying a cd
    public static void BuyCD(){
         Scanner Option = new Scanner(System.in);
                String name, telphone;
                int numberOfCDs,CDNO;
                 try {
                     System.out.println("Your name:");
                     name = Option.next();
                     System.out.println("Your Telphone:");
                     telphone = Option.next();
                     System.out.println("How many  CDs:");
                     numberOfCDs = Option.nextInt();
                     
                     //do while for number of CDs 
                     int counter = 1;
                     do{
                        System.out.println("Enter " +"CDNo." + counter);
                        CDNO = Option.nextInt();
                        counter++;
                     }while(counter <= numberOfCDs);
                                          
                     } catch (Exception e) {
                             System.out.println("Something went wrong.Please check the Data you entered and try again");
                     }
                
    }//closing Menu method
    
    
    //call to musicOrder functions
    public static void musicOrder(){
                          //call to buy  function for movies
                String[] songs ={"Cinderella", "Chameleone Collection"};
                
                Customer cust = new Customer("Annet",songs, 6670.5,"0783 675 364");
               MusicCD obj1 = new MusicCD(songs,"Cinderella", 101, 5000, 4);
               obj1.buy(cust);
    }
    
    //function to musicOrder functions
    public static void movieOrder(){
                          //call to buy  function for movies
                String[] order ={"Crazy Wedding"};                
                Customer cust = new Customer("John Doe",order, 5670.0 ,"333232");
              MovieCD MovieObj1 = new MovieCD("2hrs", "Die Hard two", 301, 3500, 8);
               MovieObj1.buy(cust);
    }
    
    
    //genral method for retunin
    public static void ReturnedCD(){
         Scanner Option = new Scanner(System.in);
                String title;
                int stolkLevel;
                 try {
                     MovieCD borrow = new MovieCD("2hrs", "Die Hard two", 301, 3500, 8);
                     System.out.println("Enter title:");
                     title = Option.nextLine();
                     System.out.println("Your StolkLevel:");
                     stolkLevel = Option.nextInt();
                     borrow.returnCD(title,stolkLevel);
                                          
                     } catch (Exception e) {
                             System.out.println("Something went wrong.Please check the Data you entered and try again");
                     }
                
    }//closing return method
    
     //genral method for borrowing
    public static void Borrow(){
         Scanner Option = new Scanner(System.in);
                String title;
                int stolkLevel;
                 try {
                     MovieCD borrow = new MovieCD("2hrs", "Die Hard two", 301, 3500, 8);
                     System.out.println("Enter title:");
                     title = Option.nextLine();
                     System.out.println("Your StolkLevel:");
                     stolkLevel = Option.nextInt();
                     System.out.println(borrow.borrow(title,stolkLevel));
                                          
                     } catch (Exception e) {
                             System.out.println("Something went wrong.Please check the Data you entered and try again");
                     }
                
    }//closingborrow/return method
    
}
