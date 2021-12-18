import java.util.Random;

public class Cat {
    private static int count;
    public String name;
    private String color;
    private Owner owner;
    public Cat(String name){
        this.name = name;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        this.owner = new Owner("incognito");
        Counter.setCount();
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void sayHello() {
        String text = String.format("Hello! My name is %s. My color is %s", this.name, this.color);
        System.out.println(text);
    }

    public void randomName(){
        Random rand = new Random();
        int value = rand.nextInt(4);
        Names text;
        switch(value){
            case 1: 
                text = Names.BODY;
                break;
            case 2: 
                text = Names.SHARIK;
                break;
            case 3:
                text = Names.ROKI;
                break;
            default:
                text = Names.REMBO;
        }
        System.out.println(text);
    }

    private class Habitat {
        private String habitat = "Earth";
        private int countOfEarth = 100;
    }

    public class Owner {
        private String name;
        public Owner(String name) {
            this.name = name;
        }
    }

    public static class Counter {
        private static void setCount() {
            count++;
        }
    }
}

enum Names {
    BODY, SHARIK, ROKI, REMBO

}