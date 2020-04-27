public class ReverseString {
    public static void main(String[] args) {

      String x=  rvrse("I love cookies");
      System.out.println(x);


    }

    public static String rvrse(String str){
        //store each character of the string str into an array
        //because you can not just reverse a whole word in one action

        //for loop to get each character in a string
        //this prints out every char in the string
        //storing the reverse chars in the letters array
        char[] letterArray = new char[str.length()];

        int IndexLetter =0;
        for(int i =str.length()-1; i>=0; i--){
            letterArray[IndexLetter]= str.charAt(i);
            IndexLetter++;
        }
        String rvrse ="";
        for(int i =0; i <str.length();i++){
            rvrse =rvrse + letterArray[i];


        }
        return rvrse;
    }
}
