

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.regex.Pattern;

@FunctionalInterface
 interface lamda{
    String validate(String pattern,String input);
}

public class LamdaExpression {

    public static void firstname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name");
        String firstname1 = sc.next();
        lamda isvalid = (pattern, fname) -> {
            return "input " + Pattern.compile(pattern).matcher(fname).matches();

        };
        System.out.println(isvalid.validate("[A-Z]{1}[a-z]{5}$",firstname1));
    }


    public static void lastname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter last name");
        String lastname1 = sc.next();
        lamda isvalid = (pattern, lname) -> {
            return "input " + Pattern.compile(pattern).matcher(lname).matches();

        };
        System.out.println(isvalid.validate("[A-Z]{1}[a-z]{4}",lastname1));
    }
//
    public static void Email(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter email");
        String email1=sc.next();

lamda isvalid = (pattern, mail) -> {
    return "input " + Pattern.compile(pattern).matcher(mail).matches();

};
        System.out.println(isvalid.validate("[a-zA-Z0-9.]+[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.][a-z]*",email1));
}

    public static void MobileNumber(){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter phone number");
        String phone=sc.next();

        lamda isvalid=(pattern, input) -> {
            return "input " + Pattern.compile(pattern).matcher(phone).matches();
        };
        System.out.println(isvalid.validate("(91-)[0-9]{10}$",phone));


    }
//
    public static void passwordValidation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password");
        String password=sc.next();

       lamda isvalid=(pattern, input) ->{
           return "input " +Pattern.compile(pattern).matcher(password).matches();
       } ;
        System.out.println(isvalid.validate("[A-Z]+[0-9]+[~!@#$%^&*]{1}[a-zA-Z0-9!@#$%]{5}",password));
    }



    public static void main(String[] args) {
        firstname();
        lastname();
        Email();
        MobileNumber();
        passwordValidation();

    }
}