package singleton;
public class LogManager2 {

    private static LogManager2 instance;

    private LogManager2(){
        // private constructor
    }

    public static LogManager2 getInstance(){
        if(instance == null){
            instance = new LogManager2();
        }
        return instance;
    }

    public void error(String msg){
        System.out.println(msg);
    }
    public void warn(String msg){
        System.out.println(msg);
    }
    public void info(String msg){
        System.out.println(msg);
    }
}

