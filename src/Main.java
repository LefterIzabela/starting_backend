import com.animal.Animal;
import com.animal.Cat;
import com.animal.Dog;
import com.animal.Mammal;
import com.car.Car;
import com.interfaceExample.DogWalk;
import com.interfaceExample.PersonWalk;
import com.interfaceExample.Walkable;
import com.person.Person;
import com.helloWorld.HelloWorld;
import com.shape.Circle;
import com.shape.Shape;
import com.shape.Square;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    HelloWorld printer = new HelloWorld();
        printer.printing();

        System.out.println(" -> First person created with the constructor with no parameters");

        Person person = new Person();
        System.out.println("This person's age is: " + person.getAge());
        System.out.println("This person's firstName is: " + person.getFirstName());
        System.out.println("This person's birthdate is: " + person.getBirthdate());
        System.out.println("This person is: " + person.toString());
        person.setAge(20);
        System.out.println("This person's age is: " + person.getAge());
        person.setFirstName("Izabela");
        System.out.println("This person's firstName is: " + person.getFirstName());
        LocalDate date = LocalDate.of(2020, 9, 28);
        person.setBirthdate(date);
        System.out.println("This person's birthdate is: " + person.getBirthdate());
        System.out.println("This person is: " + person.toString());

        System.out.println(" -> Second person created with the constructor with parameters");

        Person person2 = new Person(12, "Paul", null);
        System.out.println("This person's age is: " + person2.getAge());
        System.out.println("This person's firstName is: " + person2.getFirstName());
        System.out.println("This person's birthdate is: " + person2.getBirthdate());
        System.out.println("This person is: " + person2.toString());

        System.out.println(" -> Using LocalDate.now() on second person");

        LocalDate date2 = LocalDate.now();
        person2.setBirthdate(date2);
        System.out.println("This person's birthdate is: " + person2.getBirthdate());
        System.out.println("This person is: " + person2.toString());

        System.out.println(" -> Working on Animal class");

        Animal animal = new Animal("langos", true);
        System.out.println(animal.toString());

        System.out.println(" -> Working on Mammal class");

        Mammal mammal = new Mammal("cartofel", false, 4, "cartofica");
        mammal.setGestationPeriod(3);
        mammal.setDomesticated(true); // default boolean este False
        mammal.setSpecies("dolphin");
        System.out.println("This mammal is: species = " + mammal.getSpecies() +
                ", domesticated = " + mammal.isDomesticated() +
                ", gestationPeriod = " + mammal.getGestationPeriod() +
                ", name = " + mammal.getName());

        System.out.println(" -> Working on Dog class");

        Dog dog = new Dog("Dog", true, 4, "Cica");
        dog.toString();
        dog.isMammalExtinct();
        System.out.println("This dog is: species = " + dog.getSpecies() +
                ", domesticated = " + dog.isDomesticated() +
                ", gestationPeriod = " + dog.getGestationPeriod() +
                ", name = " + dog.getName() +
                ", isMammalExtinct() = " + dog.isMammalExtinct());
        // isi ia numele dat in super in clasa

        System.out.println(" -> Working on Cat class");

        Cat cat = new Cat("Cat", true, 5, "Kitty");
        cat.toString();
        cat.isMammalExtinct();
        System.out.println("This cat is: species = " + cat.getSpecies() +
                ", domesticated = " + cat.isDomesticated() +
                ", gestationPeriod = " + cat.getGestationPeriod() +
                ", name = " + cat.getName() +
                ", isMammalExtinct() = " + cat.isMammalExtinct());

        System.out.println(" -> Working on Shape class");

        Shape shape = new Square("Square", 20);
        printShapeArea(shape);
        //shape.getLength(); nu se poate accesa, dar pot sa-i fac cast
        System.out.println("Accessing the length from square: " + ((Square) shape).getLength());

        System.out.println(" -> Working on Square class");

        Square square =  new Square("Square", 10);
        printShapeArea(square);

        System.out.println(" -> Working on Circle class");

        Circle circle =  new Circle("Circle", 10);
        printShapeArea(circle);

        System.out.println(" -> Working on Walkable interface");

        Walkable walkable = new PersonWalk();
        printWalk(walkable);

        System.out.println(" -> Working on PersonWalk class");

        PersonWalk personWalk = new PersonWalk();
        printWalk(personWalk);
        personWalk.setAge(19);
        System.out.println("Person is underage: " + personWalk.isUnderage());
        System.out.println("Person is underage: " + personWalk.isUnderage(21));

        System.out.println(" -> Working on DogWalk class");

        DogWalk dogWalk = new DogWalk("Dog", true, 4, "Cica");
        printWalk(dogWalk);
        System.out.println(dogWalk.getName());

        System.out.println(" -> Working on Car class");

        Car car = new Car();
        car.accelerate(15.0D);
        System.out.println("The car acceleration is: " + car.getSpeed());
    }

    private static void printShapeArea(Shape shape) {
        System.out.println("Area = " + shape.calculateArea());
    }

    private static void printWalk(Walkable walkable) {
        walkable.walk();
    }
}