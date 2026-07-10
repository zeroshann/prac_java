public class xample {
    
    public static void main(String[] args) {

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 5; // 1 == highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)){
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}

/* 
securityLevel = 5; denied
securityLevel = 4; denied
securityLevel = 3; denied
securityLevel = 2; granted
securityLevel = 1; granted
 */