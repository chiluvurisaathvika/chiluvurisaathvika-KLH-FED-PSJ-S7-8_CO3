import java.util.Scanner;

public class ClinicManager2 {

    // Method to display patient details
    static void showPatient(String patient, int age,
                            String doctor, String date) {

        System.out.println("\n--- Appointment Details ---");
        System.out.println("Patient Name: " + patient);
        System.out.println("Age: " + age);
        System.out.println("Doctor Name: " + doctor);
        System.out.println("Appointment Date: " + date);
        System.out.println("Appointment Confirmed: Yes");
    }

    // Recursive method to display medicines
    static void showMedicines(String[] medicines, int index) {

        if (index < medicines.length) {
            System.out.println((index + 1) + ") " + medicines[index]);

            showMedicines(medicines, index + 1);
        }
    }

    // Method to display prescription details using 2D array
    static void showPrescription(String[][] prescription) {

        System.out.println("\n--- Prescription Details ---");
        System.out.println("Medicine        Instruction");

        for (int i = 0; i < prescription.length; i++) {
            System.out.println(
                prescription[i][0] + "        " +
                prescription[i][1]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Patient details
        System.out.print("Enter patient name: ");
        String patient = sc.nextLine();

        System.out.print("Enter patient age: ");
        int age = sc.nextInt();
        sc.nextLine();

        // Doctor details
        System.out.print("Enter doctor name: ");
        String doctor = sc.nextLine();

        // Appointment date
        System.out.print("Enter appointment date: ");
        String date = sc.nextLine();

        // 1D Array for medicines
        System.out.print("Enter number of medicines: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] medicines = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter medicine " + (i + 1) + ": ");
            medicines[i] = sc.nextLine();
        }

        // 2D Array for medicine instructions
        String[][] prescription = new String[n][2];

        for (int i = 0; i < n; i++) {

            prescription[i][0] = medicines[i];

            System.out.print("Enter instruction for "
                             + medicines[i] + ": ");
            prescription[i][1] = sc.nextLine();
        }

        // Method
        showPatient(patient, age, doctor, date);

        // Recursion
        System.out.println("\n--- Medicines ---");
        showMedicines(medicines, 0);

        // 2D Matrix
        showPrescription(prescription);

        System.out.println("\nPrescription Successful!");

        sc.close();
    }
}