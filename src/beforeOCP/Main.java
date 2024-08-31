package beforeOCP;

class Greeting {
    public String morninggreeting(String language) {
        if (language.equals("English")) {
            return "Good Morning";
        } else if (language.equals("Spanish")) {
            return "Buenos días!";
        } else if (language.equals("French")) {
            return "Bonjour!";
        }
        return "Unknown language";
    }
}

public class Main {
    public static void main(String[] args) {
        Greeting greeter = new Greeting();
        System.out.println(greeter.morninggreeting("English"));
        System.out.println(greeter.morninggreeting("Spanish"));
    }
}
