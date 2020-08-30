public class Person {
    private String firstName;
    public String getName(){
//TODO: return the person's name
        return this.firstName;
    }

    public void setName(String setName){
//TODO: change the name property to the passed value
        this.firstName = setName;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello %s!",this.firstName);
    }
    public Person(String usersName){
        setName(usersName);
        System.out.println("Person's name is: " + getName());
        sayHello();
    }
    public static void main(String[] args){
        Person dimitri = new Person("Dimitri");
        System.out.println(dimitri.getName());
    }
}
