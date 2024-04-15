package bdd.geico.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import bdd.geico.constant.Key;

public class ReadConfigProperty 
{
	private Properties properties;
	
	/**
	 * 
	 * @param propertyName {@link IProperties}
	 */
	public ReadConfigProperty(String propertyName) 
	{
		initProperty(propertyName);
	}
	
	private void initProperty(String propertyName) 
	{
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertyName);
		properties = new Properties();
		try {
			properties.load(inputStream);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param key {@link Key}
	 * @return String property value from resources/**.properties
	 */
	public String getKeyValue(Key key) 
	{
		return properties.getProperty(key.getPropertyKey());
	}
}
