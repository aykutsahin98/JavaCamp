package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{ //adaptasyon s�n�f�d�r

@Override
public void logToSystem(String message) {
	jLoggerManager manager = new jLoggerManager();
	manager.log(message);
	
}

}
