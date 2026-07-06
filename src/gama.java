public class gama {
    
    public static void main(String[] args) {
        //set the maximim score in the game to 500
        int maximum = 500;

        //the actual score of the user is 423
        int userScore = 423;

        /*calculate the percentage of the user's score in relation to the maximum score
        available score. */
        double percentage = (double) userScore / maximum * 100.0d;

        System.out.println("Percentage: " + percentage + "%");
    }
}
