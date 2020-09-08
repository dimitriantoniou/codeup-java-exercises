public class Person {
    private String name;

    public String getName(){//TODO: return the person's name
        return this.name;
    }

    public void setName(String setName){//TODO: change the name property to the passed value
        this.name = setName;
    }

    public void sayHello(){//TODO: print a message to the console using the person's name
        System.out.printf("Hello %s!",this.name);
    }

    public Person(String name){
        this.name=name;
    }

    /*understanding references
    Person person1 = new Person("John");
    Person person2 = new Person("John");
    Person person1 = new Person("John");
    Person person2 = person1;
    */

    public static void main(String[] args){
        Person dimitri = new Person("Dimitri");
        System.out.print(dimitri.getName());
        dimitri.setName("Dimitri Antoniou");
        System.out.print(dimitri.getName());
        dimitri.sayHello();
/*
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
                System.out.println(person1 == person2);
*/

    }
}
