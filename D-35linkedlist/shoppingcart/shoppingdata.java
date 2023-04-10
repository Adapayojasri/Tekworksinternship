class shoppingdata
  {
    String itemname;
    double itemcost;
    public shoppingdata(String itemname , double itemcost){
      this.itemname = itemname;
      this.itemcost =itemcost;
    }  
    public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getItemcost() {
		return itemcost;
	}

	public void setItemcost(double itemcost) {
		this.itemcost = itemcost;
	}
	public String toString()
    {
      return itemname + " " + itemcost ;
    }
   
  }