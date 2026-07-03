public class identifier {
    
    public static void main(String[] args) {

        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

        System.out.println(minutesPerHour + " vs " + m);

/*
The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter, and cannot contain whitespace
Names can also begin with $ and _
Names are case-sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
Cannot start with a digit
*/
    }
}
