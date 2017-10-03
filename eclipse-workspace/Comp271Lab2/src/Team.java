public class Team {
	
  private String name;

  private String headcoach;

  private int funding;

  public Team(final String name, final String headcoach, final int funding) {
	  
    if (name == null) {
    	
      throw new IllegalArgumentException("name is null");
      
    }
    
    this.name = name;
    
  }

  public String getName() {
	  
    return this.name;
    
  }
  
  public String getHeadcoach() {
	  
    return null;
    
  }
  public int getFunding() {
	  
    return -1;
    
  }
}