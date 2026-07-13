public class yatzi {
    
    public static void main(String[] args){
        int dice = 1;

        while (dice <= 6){
            if (dice < 6){
                System.out.println("No yatzi. ");
            } else {
                System.out.println("Yatzi! ");
            }
        dice = dice + 1;
        }
    }
}
