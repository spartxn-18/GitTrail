package LogExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example {

	
	static Logger logger=Logger.getLogger(Example.class);
	public static void main(String[] args) {
//		PropertyConfigurator.configure("/home/pravin-zstk380/eclipse-workspace/LogExample/src/Properties/log4j.properties");
		logger.info("success");
	}
}
