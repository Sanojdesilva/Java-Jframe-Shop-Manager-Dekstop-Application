package Models;

public class Bicycel {
    int gear;
    float speed;
    
    public Bicycel(int g , float s)
    {
        this.gear = g;
        this.speed = s;
    }
    
    public void breack(float decrement)
    {
        this.speed -= decrement;
    }
    
    public void accelerate(float increment)
    {
        this.speed += increment;
    }
    
    @Override
    public String toString()
    {
        return "Speed is "+this.speed+" in gear "+this.gear;
    }
}
