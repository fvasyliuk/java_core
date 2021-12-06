public class Home_4 {
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal();
        wolf.say();
        HomeAnimal dog = new HomeAnimal();
        dog.say();
        dog.showNumberOfLegs();

        CatMale garfield = new CatMale("Garfield", "red");
        garfield.sayHello();

        CatFemale mia = new CatFemale("Mia", "black");
        mia.sayHello();
    }

    
}

class CatFemale extends Cat {
    CatFemale(String name, String color) {
        super(name, color);
    }
}

class CatMale extends Cat {
    CatMale(String name, String color) {
        super(name, color);
    }
}