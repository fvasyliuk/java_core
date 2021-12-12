public class HomeAnimal extends Animal {
    private int numberOfLegs = 4;

    HomeAnimal() {
        super();
    }

    public final void showNumberOfLegs(){
        String text = String.format("number of legs is %s.", this.numberOfLegs); 
        System.out.println(text);
    }
}