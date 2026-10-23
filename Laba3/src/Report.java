public class Report {
    static void generateReport(Employee[] arr) {
        for (Employee e : arr) {
            System.out.printf("%-15s %10.2f%n", e.getFullname(), e.getSalary());
        }
    }
}
