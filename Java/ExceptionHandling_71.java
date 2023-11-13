package Learning.Java;

public class ExceptionHandling_71 {

    public static void main (String[] args) {
        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole (int currentYear) {

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String userDataOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(userDataOfBirth);
        return "You are " + age + " years old.";
    }

    public static String getInputFromScanner (int currentYear) {
        return "";
    }
}
