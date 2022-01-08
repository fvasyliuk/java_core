public class YearExceptions extends Exception { 
    public YearExceptions(String errorMessage) {
        super(errorMessage + " -error: you younger than 18 year old");
    }
}