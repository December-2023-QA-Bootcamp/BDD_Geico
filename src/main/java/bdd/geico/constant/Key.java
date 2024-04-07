package bdd.geico.constant;

public enum Key 
{
	URL("url"), 
	PAGE_WAIT("page_wait"), 
	ELEMENT_WAIT("element_wait"),
	BROWSER("browser"),
	;
	
	private String propertyKey;
	
	private Key(String propertyKey) 
	{
		this.propertyKey = propertyKey;
	}
	
	public String getPropertyKey() 
	{
		return propertyKey;
	}
}
