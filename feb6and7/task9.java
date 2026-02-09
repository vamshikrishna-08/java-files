public class task9 {    //API Response Time Analysis
    public static void main(String[] args) {
        int[] responseTimes = {450, 1200, 2300, 1800, 3200, 900, 2500};
        int slowApiCount = 0;
        int totalTime = 0;
        System.out.println("Slow APIs (response time > 2000 ms):");
        for (int time : responseTimes) {
            totalTime += time;
            if (time > 2000) {
                slowApiCount++;
                System.out.println(time + " ms");
            }
        }
        double averageResponseTime = (double) totalTime / responseTimes.length;
        System.out.println("\nTotal APIs: " + responseTimes.length);
        System.out.println("Number of Slow APIs: " + slowApiCount);
        System.out.println("Average Response Time: " + averageResponseTime + " ms");
    }
}
