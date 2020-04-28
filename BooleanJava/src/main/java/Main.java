public class Main {
    public static void main(String[] args) {

        boolean passedLevel = true;
        boolean stayedLevel =false;
        boolean passedAllLevels =false;
        int LevelCounter =0;


     //if condition is true, code in brackets will execute.
       if(passedLevel){
           System.out.println("first level passed");
           LevelCounter++;
       }
        if(passedLevel){
            System.out.println("2nd level passed");
            LevelCounter++;
        }
        if(passedLevel){
            System.out.println("3rd level passed");
            LevelCounter++;
        }
        if(LevelCounter==3){
            passedAllLevels =true;
        }
        if(passedAllLevels){
            System.out.println("you won!");
        }
    }
}
