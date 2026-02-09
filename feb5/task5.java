class task5 { //Static vs Instance Variable Tracker
    static int totalLogins = 0;
     int sessionId;
       task5(int sessionId) {
        this.sessionId = sessionId;
        totalLogins++;
    }
    void displayLoginInfo() {
        System.out.println("User Session ID: " + sessionId);
        System.out.println("Total Logins: " + totalLogins);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        task5 user1 = new task5(101);
        user1.displayLoginInfo();
        task5  user2 = new task5(102);
        user2.displayLoginInfo();
        task5  user3 = new task5(103);
        user3.displayLoginInfo();
    }
}
