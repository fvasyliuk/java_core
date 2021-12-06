public class Cat {
    public String name;
    private String color;
    public Cat(String name){
        this.name = name;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
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
}