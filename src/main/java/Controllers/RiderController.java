package Controllers;
import Models.Rider;

public class RiderController {
    Rider obj;
    Rider.Record ob;
    
    public Rider addRider(String n, String c, int a, float w, float h){
        obj = new Rider(n,c,a,w,h);
        return obj;
    }
    
    public Rider.Record addRecord(int o, float t, int n){
        ob = obj.new Record(o,t,n);
        return ob;
    }
}
