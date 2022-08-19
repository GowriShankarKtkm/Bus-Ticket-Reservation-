package busRev;
import java.util.*;
public class Busdemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,15));
        buses.add(new Bus(3,true,12));
        for(Bus b:buses){
            b.diplayInfo();
        }
        int useropt=1;
        Scanner sc = new Scanner(System.in);
        while (useropt==1){
            System.out.println("Enter 1 to book and 2 to exit");
            useropt= sc.nextInt();
            if(useropt==1) {
                //System.out.println("booking...");
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Congrats.. booking is confirmed");
                }
                else System.out.println("Sorry bus is full, try another bus or date");
            }
        }
    }
}
