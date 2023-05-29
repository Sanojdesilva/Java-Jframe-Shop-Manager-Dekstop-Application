package Models;
import Controllers.RiderController;

public class Rider {
    String name;
    String country;
    int age;
    float Weight;
    float height;
    
    public Rider(String n, String c, int a, float w, float h){
        this.name = n;
        this.country = c;
        this.age = a;
        this.Weight = w;
        this.height = h;
    }

    public double calBMI(float weight, float height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class Record{
        int No_Of_Olympic_Medals;
        float TopSpeed;
        int No_National_Level_Records;
        
        public Record(int o, float t, int n){
            this.No_Of_Olympic_Medals = o;
            this.TopSpeed = t;
            this.No_National_Level_Records = n;
        }
        Rider ob;
        public String displayRecords(){
            return "No Of Olympic Medals :"+ this.No_Of_Olympic_Medals +
                    "\nTop Speed :"+ this.TopSpeed +
                    "\nNo_National_Level_Records :"+this.No_National_Level_Records +
                    "\nName :"+ob.name +
                    "\nCountry :"+ob.country +
                    "\nAge :"+ob.age +
                    "\nWeight :"+ob.Weight +
                    "\nHeight :"+ob.height;
        }
    } 
    
    public double calBMI(){
        class BMI{
            Rider ob;
            float WeightMetic = ob.Weight;
            float HeightMetic = ob.height;
            
            public double bmi(){
                double bmi;
                
                bmi = this.WeightMetic/(this.HeightMetic*this.HeightMetic);
                return bmi;
            }
        }
        BMI ob = new BMI();
        return ob.bmi();
    }
}

