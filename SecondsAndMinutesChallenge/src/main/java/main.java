public class main {

    public static void main(String[] args) {
        System.out.println(getDurationString(60,23));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int mins, int secs){
        if(mins <0 ||secs <0|| secs >59){
           return "Invalid value";
        }
        //calculate hours and mins
        int hours= mins / 60;
        int remainingMins = mins %60;
        return hours +"h " +remainingMins +" m " + secs +"s ";


    }

    public static String getDurationString(int secs){
        if(secs <0){
            System.out.println("Invalid value");
        }
        int mins = secs /60;
        int remainderSecs =secs %60;

        return getDurationString(mins,remainderSecs);
    }
}
