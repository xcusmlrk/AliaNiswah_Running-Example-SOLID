package afterOCP;

interface Greeting {
    String morninggreeting();
}

class IndonesianGreeting implements Greeting {
    @Override
    public String morninggreeting() {
        return "Selamat Pagi!";
    }
}

class EnglishGreeting implements Greeting {
    @Override
    public String morninggreeting() {
        return "Good Morning!";
    }
}

class FranceGreeting implements Greeting {
    @Override
    public String morninggreeting() {
        return "Bonjour!";
    }
}

class JapanGreeting implements Greeting {
    @Override
    public String morninggreeting() {
        return "おはようございます";
    }
}

class KoreanGreeting implements Greeting {
    @Override
    public String morninggreeting() {
        return "안녕하세요";
    }
}

public class Main {
    public static void main(String[] args) {
        Greeting Indonesia = new IndonesianGreeting();
        Greeting English = new EnglishGreeting();
        Greeting Korea = new KoreanGreeting();

        System.out.println(Indonesia.morninggreeting());
        System.out.println(English.morninggreeting());
        System.out.println(Korea.morninggreeting());
    }
}