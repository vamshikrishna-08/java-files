public class task6 {    //Student Marks Validation
    public static void main(String[] args) {
        int[] marks = {78, 45, 102, -5, 67, 39, 90};
        int passCount = 0;
        int failCount = 0;
        int invalidCount = 0;
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                invalidCount++;
            } 
            else if (mark >= 40) {
                passCount++;
            } 
            else {
                failCount++;
            }
        }
        System.out.println("Total Students: " + marks.length);
        System.out.println("Passed Students: " + passCount);
        System.out.println("Failed Students: " + failCount);
        System.out.println("Invalid Marks Count: " + invalidCount);
    }
}
