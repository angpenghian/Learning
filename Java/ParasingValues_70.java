package Learning.Java;


public class ParasingValues_70 {
    public static void main(String[] args) {
        int currentYear = 2022;
        String userDataOfBirth = "1999";

        int yearOfBirth = Integer.parseInt(userDataOfBirth);

        System.out.println("Age = " + (currentYear - yearOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double usersAge = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he's  = " + usersAge);
    }
}
