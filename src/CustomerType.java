
public enum CustomerType {

	RETAIL_CUSTOMER,
	TRADE_CUSTOMER,
	COLLEGE_CUSTOMER;
	
	@Override
	public String toString() {
		String s = "";
		if (this.ordinal()==0) {
			s = "Retail customer";
		} else if (this.ordinal()==1) {
			s = "Trade customer";				
		} else if (this.ordinal()==2) {
			s = "College customer";
		}
		return s;
	}
}
