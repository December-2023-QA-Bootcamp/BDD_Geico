package bdd.geico.constant;

public interface IResource 
{	
	public interface IBrowser
	{
		String CHROME 	= "chrome";
		String FIREFOX 	= "firefox";
		String SAFARI	= "safari";
		String EDGE		= "edge";
	}
	
	public interface ILob
	{
		String AUTO		= "auto";
		String HOME		= "homeowner";
		String RENTER	= "renter";
	}
	
	/*
	 * Properties File Resource Name
	 */
	public interface IProperties
	{
		String CONFIG_RESOURCE = "config.properties";
	}
	
	/*
	 * Excel File Resource Name
	 */
	public interface IExcel
	{
		
	}
}
