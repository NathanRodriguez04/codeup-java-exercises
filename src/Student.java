import java.util.ArrayList;
public class Student {
    public static void main(String[] args) {
        ArrayList<String> namesArr = new ArrayList<>();
        namesArr.add("Juan");
        namesArr.add("Sean");
        namesArr.add("Stephen");
        namesArr.add("Nathan");
        namesArr.add("Erik");
        System.out.printf("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        System.out.println(namesArr);
        System.out.printf("Here are the grades of our students in order:");
        ArrayList<String> gradesArr = new ArrayList<>();
        gradesArr.add("A");
        gradesArr.add("B");
        gradesArr.add("C");
        gradesArr.add("D");
        gradesArr.add("F");
        System.out.println(gradesArr);
    }
}