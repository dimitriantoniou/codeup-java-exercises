import java.util.Arrays;

public class ArraysExercises{
    public static void main(String[] args){
    //What happens when you run the following code? Why is Arrays.toString necessary?
        //int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(numbers);
        //it doesnt run because we are expecting a different type

    //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.
        Person [] peopleArray = new Person[3];

        Person dimitri = new Person ("Dimitri");
        Person bernice = new Person ("Bernice");
        Person caitlin = new Person ("Caitlin");

        peopleArray[0] = dimitri;
        peopleArray[1] = bernice;
        peopleArray[2] = caitlin;

        for(int i=0;i<peopleArray.length;i++){
            System.out.println(peopleArray[i]);
        }





    // int [] numbers = {1, 2, 3, 4, 5};
    // System.out.println(Arrays.toString(numbers));
    // System.out.println(numbers);


    }
    //Create a static method named addPerson.
    // It should accept an array of Person objects, as well as a single person object to add to the passed array.
    // It should return an array whose length is 1 greater than the passed array,
    // with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] people, String person){
        Person[] newPeopleArray = new Person[people.length + 1];
        newPeopleArray[newPeopleArray.length-1]=new Person(person);
        return newPeopleArray;
    }
}

/*
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
 */
