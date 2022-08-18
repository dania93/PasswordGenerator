import java.util.Random;

public class GeneratePassword {

    public static void main(String[] args) {
        int passwordLength = 8;
        System.out.print("Your new password is: ");
        System.out.println(generate(passwordLength));
    }

    static char[] generate(int passwordLength) {

        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        StringBuilder allValues = new StringBuilder(capitalChars + smallChars + numbers);

        Random random = new Random();

        char[] newPassword = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            newPassword[i] = allValues.charAt(random.nextInt(allValues.length()));
        }

        return newPassword;

    }

}
