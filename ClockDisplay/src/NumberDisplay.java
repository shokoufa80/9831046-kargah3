
public class NumberDisplay {
    private int number;
    private int limit;
    public NumberDisplay(int limit){
        this.limit = limit;
        number = 0;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void increment(){
        number = (number + 1) / limit;
    }
    public String tick(){
        if(number < 10)
           return "0" + number;
        else
           return "" + number;      
    }         
}
