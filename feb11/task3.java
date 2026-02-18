class ReportTask extends Thread {  //Report Generation System (join())
    private final String reportName;
    public ReportTask(String reportName) {
        this.reportName = reportName;
    }
    @Override
    public void run() {
        System.out.println(reportName + " generation started.");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println(reportName + " interrupted.");
        }
        System.out.println(reportName + " generation completed.");
    }
}
public class task3 {
    public static void main(String[] args) throws InterruptedException {
        ReportTask salesReport = new ReportTask("Sales Report");
        ReportTask inventoryReport = new ReportTask("Inventory Report");
        ReportTask profitReport = new ReportTask("Profit Report");
        salesReport.start();
        inventoryReport.start();
        profitReport.start();
        salesReport.join();
        inventoryReport.join();
        profitReport.join();
        System.out.println("All reports completed.");
    }
}
