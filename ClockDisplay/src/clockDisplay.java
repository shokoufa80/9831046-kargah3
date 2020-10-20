
public class clockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String display;
    public clockDisplay(){
       hours = new NumberDisplay(24);
       minutes = new NumberDisplay(60);
       seconds = new NumberDisplay(60);
    } 
    public void updateDisplay(){
        display = hours.tick() + ":" + minutes.tick() + ":" + seconds.tick();       
    }
    public void timeTick(){
        seconds.increment();
        if(seconds.getNumber() == 0){
            minutes.increment();
            if( minutes.getNumber() == 0)
                hours.increment();  
        }
        updateDisplay(); 
    }
    public void print(){
       System.out.println(display);
    } 
}
