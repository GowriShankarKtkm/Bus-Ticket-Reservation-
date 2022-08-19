package busRev;
public class Bus {
    //encapsulation
    private int busnum;
    private boolean ac;
    private int capacity;
    Bus(int busnum,boolean ac,int capacity){
        this.busnum=busnum;
        this.ac=ac;
        this.capacity=capacity;
    }
    public int getCapacity(){//accessor
        return capacity;
    }
    public boolean isAc(){
        return ac;
    }
    public int getBusnum(){
        return busnum;
    }
    public void setCapacity(int c){//mutator
        capacity=c;
    }

    public void setBusnum(int busnum) {
        this.busnum = busnum;
    }

    public void setAc(boolean ac){
        this.ac=ac;
    }
    public void  diplayInfo(){
        System.out.println("Bus no:"+busnum+" Ac:"+ac+" Total Capacity: "+capacity);
    }
}
