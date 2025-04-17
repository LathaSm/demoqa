package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	 public Properties properties;

	    public ConfigReader(String filePath) {
	        properties = new Properties();
	        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
	            properties.load(fileInputStream);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	  
		public String getProperty(String key) {
			// TODO Auto-generated method stub
			String value = properties.getProperty(key);
	        if (value == null) {
	            throw new IllegalArgumentException("Key not found in properties file: " + key);
	        }
	        return value;
		}

}
