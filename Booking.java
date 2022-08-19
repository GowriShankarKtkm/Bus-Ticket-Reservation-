package busRev;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    String passengerName;
    int busnum;
    Date date;
    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the passenger: ");
        passengerName=sc.nextLine();
        System.out.println("Enter bus no: ");
        busnum=sc.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput=sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBusnum()==busnum){
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for (Booking b:bookings){
            if(b.busnum==busnum && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
