//Exercise 1
public class SingletonPattern{
	static class Logger{
		public static Logger instance;
		public Logger(){
			System.out.println("Logger instance created.");
		}
		public static Logger getInstance(){
			if(instance == null){
				instance = new Logger();
			}
			return instance;
		}
		public void log(String message){
			System.out.println("Log : " +message);
		}
	}
	public static void main(String args[]){
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		logger1.log("Application Started");
		logger2.log("Processing Data");
		if(logger1 == logger2){
			System.out.println("Only one Logger instance exists.");
		}
		else{
			System.out.println("Multiple Logger instance exists.");
		}
	}
}
		
