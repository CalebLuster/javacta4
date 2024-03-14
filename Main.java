import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter the day of the week (Monday through Sunday): ");
            String day = scanner.nextLine();
            System.out.print("Enter the average temperature for " + day + ": ");
            double temperature = scanner.nextDouble();
            scanner.nextLine(); 

            daysOfWeek.add(day);
            temperatures.add(temperature);
        }

        System.out.print("Enter the day of the week or 'week': ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("week")) {
            double sum = 0;
            for (int i = 0; i < daysOfWeek.size(); i++) {
                System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i));
                sum += temperatures.get(i);
            }
            double average = sum / temperatures.size();
            System.out.println("Weekly average temperature: " + average);
        } else {
            int index = daysOfWeek.indexOf(input);
            if (index != -1) {
                System.out.println(daysOfWeek.get(index) + ": " + temperatures.get(index));
            } else {
                System.out.println("Invalid input");
            }
        }

        scanner.close();
    }
}