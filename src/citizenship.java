public class citizenship {
    public static void main(String[] args) {
        int myAge = 20;
        boolean isCitizen = true;

        if (myAge >= 18) {
            System.out.println("You are old enough to vote.");

            if (isCitizen) {
                System.out.println("And your are a citizen. You can vote.");
            } else {
                System.out.println("But you are not a citizen. You cannot vote.");
            }
        } else {
            System.out.println("You are not old enough to vote.");
        }
    }
}