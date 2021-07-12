package oop;

public class ObjectOrientedProgramming {


    public static void main(String[] args) {

        Person person = new Person();

        person.setName("juan");

        System.out.println(person.getEntertainment("drinking"));

        Person nathanPerson = new Person();
        nathanPerson.setName("nathan");
        System.out.println(nathanPerson.getEntertainment("play games"));


    }



}