package Accenture;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctYearCounter {

    public static int countDistinctYears(String document) {
        int distinctYears = 0;
        HashSet<Integer> yearSet = new HashSet<>();

        String[] tokens = document.split(" ");
        for (String token : tokens) {
            if (token.length() == 10 && token.chars().filter(ch -> ch == '-').count() == 2) {
                String[] dateParts = token.split("-");
                
                if (dateParts.length == 3 && dateParts[2].matches("\\d{4}")) {
                    int year = Integer.parseInt(dateParts[2]);

                    if (year >= 0 && year <= 9999) {
                        yearSet.add(year);
                    }
                }
            }
        }

        distinctYears = yearSet.size();
        return distinctYears;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the document text: ");
        String document = scanner.nextLine();
        
        int result = countDistinctYears(document);
        System.out.println("Number of distinct years: " + result);

        scanner.close();
    }
}
