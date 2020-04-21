import java.util.HashMap;

public class main {

    public static void main(String[] args) {

        //assigning and printing values to keys in HashMap
       int a = 5;
        int b= 12;
        int c =45;

        HashMap<String, Integer> coolMap = new HashMap<String, Integer>();
        coolMap.put("a", 5);
        coolMap.put("b", 12);
        coolMap.put("c", 45);

        System.out.println(coolMap.get("c"));

        System.out.println("===========");

        //==========================================================

        //username and password example



        HashMap<String, String> website = new HashMap<String, String>();
        website.put("aahussain1230", "cats123!");
        website.put("tigerKing1970", "carolBaskinIs3vil!");
        website.put("awesomePerson1130", "passWord19993");

        //get size of hashmap

        System.out.println(website.size());

        website.remove("aahussain1230");

        //see if hashmap contains a certain VALUE. will return true if value is in hashmap ; false if not

        System.out.println(website.containsValue("passWord19993"));

        //see if hashmap contains a certain KEY
        System.out.println((website.containsKey("tigerKing1970")));


        System.out.println(website);

        //replace value with new value

        System.out.println(website.replace("tigerKing1970", "c00lCats123!"));

        System.out.println(website);

        //get all keys

        System.out.println(website.keySet());

        //get all values

        System.out.println(website.values());



    }
}
