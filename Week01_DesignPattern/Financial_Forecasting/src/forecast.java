
public class forecast {
    public static double Predict(double currVal, double growthRate, int year){
//        Base case
        if(year ==0){
            return  currVal;

        }
//        Update year in each call and update currValue as well
        return Predict(currVal * (1 + growthRate), growthRate, year -1);
    }


    public static void main(String[] args){
        double curr = 10000; //suppose 10 k rupess
        double grate = 0.12; //12%

        int year =5;
        double futureValue = Predict(curr, grate, year);

        System.out.println(
                "Predicted Future Value: " + futureValue
        );
    }
}
