public class Main {
    public static void main(String[] args) {
        
        Human person = new Human("John", 30, "doe");

        // Using the getter methods
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + "Surname: " + person.getSurname());

        // Using the setter methods
        person.setName("John");
        person.setSurname("Cena");
        person.setAge(28);

        // Invoking the custom method
        person.talk("AND HIS NAME IS JOHN CENA");
    }
}
