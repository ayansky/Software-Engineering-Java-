
public class Vehicle {
	 int mYear;
	 String mBrand;
	 String mModel;
	 int mMiles;
     int mPrice;
	
	public Vehicle() {}
	public boolean worthBuying(int n) {
		if(n>=mPrice) {
			return true;
		}
		else {
			return false;
		}
	}

}
