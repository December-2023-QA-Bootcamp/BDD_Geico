package unittest;

import org.junit.Test;

import bdd.geico.constant.IResource.IProperties;
import bdd.geico.constant.Key;
import bdd.geico.util.ReadConfigProperty;

public class ReadConfigPopertyTest 
{

	@Test
	public void readPropertyInitTest() 
	{
		ReadConfigProperty config = new ReadConfigProperty(IProperties.CONFIG_RESOURCE);
		System.err.println(config.getKeyValue(Key.URL));
	}
}
