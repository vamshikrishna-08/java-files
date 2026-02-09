public class task7 {        //System Health Checks
     public static void main(String[] args) {
        double cpuUsed = 75.0;
        double cpuTotal = 100.0;
        double memUsed = 14.2;
        double memTotal = 16.0;
        double cpuUsagepct = (cpuUsed / cpuTotal)* 100;
        double memUsagepct = (memUsed / memTotal) * 100;
        String status = (cpuUsagepct > 80 || memUsagepct > 80) ? "CRITICAL " : "HEALTHY";
        System.out.println("--- system health check ---");
        System.out.printf("CPU USAGE : %.2f%%%n", cpuUsagepct);
        System.out.printf("MEMORY USAGE : %.2f%%%n", memUsagepct);
        System.out.println("Status : "+ status);
    }
}