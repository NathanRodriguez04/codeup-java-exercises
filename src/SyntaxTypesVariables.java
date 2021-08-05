import java.util.Locale;

public class SyntaxTypesVariables {

    public static void main(String[] args) {
//
////        127 is the largest number a 'byte' data type can be
//        byte bite = 127;
//        System.out.println(bite); // 127
//
////        coerces it into java.lang.Integer (not int)
//        System.out.println(bite + 1); //128
//
//        System.out.println(((Object)(bite + 1) ).getClass().getName());
//        // java.lang.Integer
//
//        byte myFirstNum = 127;
//        byte mySecondNum = 1;
////        a byte plus a byte will coerce it into an Integer (not int)
////        System.out.println(myFirstNum + mySecondNum);
//
//
////        can't do this:
//        // doesn't like it!
//        // because we can't assign an Integer to a byte data type
////        myFirstNum = myFirstNum + mySecondNum;
//
//        myFirstNum += mySecondNum;
////        still a byte
//        System.out.println(myFirstNum); // returns -128, I don't
//        // understand this math but sure, it makes sense -- next num
//        // after 127 is -128 going upward -- the reason it goes back to
//        // the beginning of a new byte at -128 is because by defining it
//        // as byte means it won't coerce into a new type
//

//        ----------------- FLOATS
//        float myFirstFloat = 332767;
//        or
//        float mySecondFloat = 33.1f;
//        short myFirstShort = 1;
//
//        myFirstFloat += myFirstShort;
//        System.out.println(myFirstFloat); // 32768.0

//        ----- STRINGS
////        strings must be in double quotes
//        System.out.println("Hello, my name is Laura");
//
////        single quotes define one single character
//
//        System.out.println('h' + 'e' + 'l' + 'l' + 'o'); // returns 532
//
////        let's coerce this into an int
////        every character in java has a unique numerical value
////        there are a total of 127 characters ... which matches the
////        largest number a byte can be ... not sure this makes sense
//        System.out.println((int)'H'); //72
//        System.out.println((int)'h'); // 104
//
//        ----- COMPLEX OBJECTS
//        String myName = "Laura";
//        System.out.println(myName);
//        //        complex objects is an object type so it has methods we can use on it
//        System.out.println(myName.toUpperCase());
////      string concatenation still possible:
//        System.out.println(myName + ", you are my favorite person ever!");
//
//        ------ BOOLEANS
//        var isNiceDay = true;
//        if(isNiceDay){
//            System.out.println("what a lovely day");
//        } else {
//            System.out.println(" mmm it's too hot");
//        }

        byte temperature = 74;
        var isNiceDay = (temperature > 60) && (temperature < 80);
        if(isNiceDay){
            System.out.println("what a lovely day");
        } else {
            System.out.println(" mmm it's wayyy too hot");
        }

    }

}