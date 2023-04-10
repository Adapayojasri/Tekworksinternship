class inventorymanagementdata
  {
    String product;
    int value;
    public managementData(int v ,String p)
    {
      product = p;
      value = v;
    }
	public String getProduct() {
		return product;
	}
	
	public int getValaue() {
		return value;
	}
	public String toString(){
    return product + " " + value ;
  }
    
  }