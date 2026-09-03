public class greeter {
    
    static void specificGreeter(String name) {
        System.out.println("Nice to meet you, " + name + "!");
    }

    public static void main(String[] args) {
        String name = "Kristian";
        specificGreeter(name);
    }
}
