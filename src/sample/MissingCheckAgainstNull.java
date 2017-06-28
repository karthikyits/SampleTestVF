package sample;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MissingCheckAgainstNull {
	private static Logger logger = Logger.getLogger(MissingCheckAgainstNull.class.getName());
	public void fetchSampleManager(){
		Object obj = nullPossibleFunction(new Date());
		Class clazz = obj.getClass();
		String returnValue = ((String)obj).toLowerCase();
		logger.log(Level.INFO, clazz.toString());
		logger.log(Level.INFO, returnValue);
	}
	
	public String nullPossibleFunction(Date date){
		if(date.getTime() % 2 == 0){
			return "Return";
		}
		return null;
	}
}
