import java.util.Arrays;
import static java.util.Arrays.copyOf;

public static void addPerson(Person [] arr1,String newPerson){
    Person [] copy1 = Arrays.copyOf(arr1, arr1.length +1);
    copy1[copy1.length-1] = new Person(newperson);
    System.out.println("We just added " + newperson);
    for (Person personname : copy1){
        System.out.println("Person objects = " + Person.getName(personname));
        };
    };

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
    }

    //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

    //Create a static method named addPerson.
    // It should accept an array of Person objects, as well as a single person object to add to the passed array.
    // It should return an array whose length is 1 greater than the passed array,
    // with the passed person object at the end of the array.

    // int [] numbers = {1, 2, 3, 4, 5};
    // System.out.println(Arrays.toString(numbers));
    // System.out.println(numbers);
    Person person1 = new Person("dimitr");
    Person person2 = new Person("bernice");
    Person person3 = new Person("caitlin");

    Person [] peopleArray = {person1, person2, person3};

}

