import java.util.Arrays;

public class Home_5 {
    public static void main(String[] args) {
        Dog body = new Dog("Body");
        body.say("Hello");
        body.say("Gav gav gav", "Tuzik");

        Dog first = new Dog("First");
        Dog second = new Dog("Second");
        Dog lastDog = new Dog("LastDog");

        Dog[] compareArr = {lastDog, first, second};
        Arrays.sort(compareArr);

        for (Dog d: compareArr) {
            System.out.println(d.getName());  
        }

        try {
            Dog cloneDog = (Dog)body.clone();
        } catch(CloneNotSupportedException c) {}
      
    }
}

class Dog implements IImplementPolymorphism, Comparable<Dog>, Cloneable, IFirst, ISecond {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.name.length();
    }

    @Override
    public void sayName() {
        System.out.println(this.name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  
    }

    @Override
    public int compareTo(Dog dog){  
        if(this.getSize() < dog.getSize()) {
            return -1;
        }
        if (this.getSize() > dog.getSize()) {
            return 1;
        }
        return 0; 
    }  
}

interface IImplementPolymorphism {
    default void say(String text) {
        System.out.println(text);
    }

    default void say(String text, String name) {
        String message = String.format("Hello %s! %s", name, text); 
        System.out.println(message);
    }
}

interface IFirst {
    public void sayName();
}
interface ISecond {
    public void sayHello();
}