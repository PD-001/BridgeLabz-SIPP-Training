package Methods;
import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a number between 100000 and 999999
    }

    // Method to check if all OTPs are unique
    public static boolean areUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false; // If adding fails, the OTP is not unique
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Check uniqueness of the generated OTPs
        boolean unique = areUnique(otps);
        
        // Print the OTPs and whether they are unique
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + unique);
    }
}