import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        toString(numbers);

        // For loop to print out all items in the array

//        for(int n : numbers){
//            System.out.println(n);
//        }

        String[] Person = new String[3];
        Person[0] = "nathan";
        Person[1] = "mya";
        Person[2] = "tiger";

        String personElement = "kayn";

        for(String n: Person){
            System.out.println(n);
        }


        System.out.println("Array after adding " + personElement +
                " to the new array is now " +
                Arrays.toString(addPerson(Person, personElement)));

    }

    private static void toString(int[] numbers) {

        System.out.println(Arrays.toString(numbers));

    }

    static String[] addPerson(String[] person, String element){

        person = Arrays.copyOf(person, person.length + 1);

        person[person.length - 1] = element;

//        System.out.println(Arrays.toString(person));

        return person;

    }

}