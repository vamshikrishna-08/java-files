public class task2 {        //Daily Server Load Monitoring
    public static void main(String[] args) {
        double [] cpuloads = { 45.5 , 78.2 , 33.1 , 92.5 , 55.0 , 61.8 , 40.4} ;
        double highest = cpuloads[0];
        double lowest = cpuloads[0];
        double sum = 0 ;    
        for ( double load : cpuloads){
            if (load > highest) highest = load ;
            if (load < lowest ) lowest = load ;
            sum += load ;
        }
        double average = sum / cpuloads.length ;
        System.out.println("daily server load report ");
        System.out.println(" ---------------------");
        System.out.println("Highest load : " + highest + "%");
        System.out.println("lowest load : " + lowest + "%");
        System.out.printf("avearge load : %.2f%%\n" , average );
    }   
}
