package singleton;

public class DBConnection {

    private final String connectionStrin;
    private String connectionString;
    private static DBConnection instance;

    private DBConnection(String connectionStrin, String connectionString) {
        this.connectionStrin = connectionStrin;
    }

    public static DBConnection getInstance(String connectionString){
        if (instance == null){
            instance = new DBConnection(connectionString, connectionString);
        }
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
