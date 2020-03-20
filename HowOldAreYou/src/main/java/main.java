import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Hello, please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name);


        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        System.out.println(age);

        if(age < 16){
            System.out.println("You can not drink" + ""+  name);
        }
        if(age <18 ){
            System.out.println("You can not vote" + ""+ name);
        }
        if(age <25){
            System.out.println("You can nott rent a car" +""+  name);
        }else
            if(age >=25){
                System.out.println("You can do anything that is legal!"+ " "+ name);
            }

    }
}
