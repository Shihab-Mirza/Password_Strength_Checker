import java.util.Scanner;

public class Password_Strength_Checker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        int special = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercase++;
            } else if (Character.isLowerCase(c)) {
                lowercase++;
            } else if (Character.isDigit(c)) {
                digit++;
            } else if (!Character.isLetterOrDigit(c)) {
                special++;
            }
        }

        String strength = "";
        String suggestion1 = "";
        String suggestion2 = "";
        String suggestion3 = "";
        String suggestion4 = "";

        if (password.length() < 8) {
            suggestion1 = "Add more characters (minimum length 8 required)";
        }

        if (uppercase == 0) {
            if (suggestion1.isEmpty()) {
                suggestion1 = "Add uppercase character";
            } else if (suggestion2.isEmpty()) {
                suggestion2 = "Add uppercase character";
            } else if (suggestion3.isEmpty()) {
                suggestion3 = "Add uppercase character";
            } else {
                suggestion4 = "Add uppercase character";
            }
        }

        if (lowercase == 0) {
            if (suggestion1.isEmpty()) {
                suggestion1 = "Add lowercase character";
            } else if (suggestion2.isEmpty()) {
                suggestion2 = "Add lowercase character";
            } else if (suggestion3.isEmpty()) {
                suggestion3 = "Add lowercase character";
            } else {
                suggestion4 = "Add lowercase character";
            }
        }

        if (digit == 0) {
            if (suggestion1.isEmpty()) {
                suggestion1 = "Add digit";
            } else if (suggestion2.isEmpty()) {
                suggestion2 = "Add digit";
            } else if (suggestion3.isEmpty()) {
                suggestion3 = "Add digit";
            } else {
                suggestion4 = "Add digit";
            }
        }

        if (special == 0) {
            if (suggestion1.isEmpty()) {
                suggestion1 = "Add special character";
            } else if (suggestion2.isEmpty()) {
                suggestion2 = "Add special character";
            } else if (suggestion3.isEmpty()) {
                suggestion3 = "Add special character";
            } else {
                suggestion4 = "Add special character";
            }
        }

        int count = 0;
        if (!suggestion1.isEmpty()) {
            count++; }

        if (!suggestion2.isEmpty()) {
            count++;
        }
        if (!suggestion3.isEmpty()) {
            count++;
        }

        if (!suggestion4.isEmpty()) {
            count++;
        }

        if (count == 0) {
            strength = "Strong";
        } else if (count <= 2) {
            strength = "Moderate";
        } else {
            strength = "Weak";
        }

        System.out.println("Password Strength: " + strength);
        if (!strength.equals("Strong")) {
            System.out.println("Improvement suggestions:");
            if (!suggestion1.isEmpty()) {
                System.out.println("- " + suggestion1);
            }
            if (!suggestion2.isEmpty()) {
                System.out.println("- " + suggestion2);
            }
            if (!suggestion3.isEmpty()) {
                System.out.println("- " + suggestion3);
            }
            if (!suggestion4.isEmpty()) {
                System.out.println("- " + suggestion4);
            }
        }
    }
}
         