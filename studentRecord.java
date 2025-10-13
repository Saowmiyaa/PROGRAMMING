import java.util.Scanner;

public class studentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ids = new int[50];
        String[] names = new String[50];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter ID: ");
                ids[count] = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                names[count] = sc.nextLine();
                count++;
                System.out.println("Student Added Successfully!");
            } 
            else if (choice == 2) {
                if (count == 0) {
                    System.out.println("No Students Available.");
                } else {
                    System.out.println("\n--- Student List ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println("ID: " + ids[i] + " | Name: " + names[i]);
                    }
                }
            } 
            else if (choice == 3) {
                System.out.println("Exiting...");
            } 
            else {
                System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
