package automobileInterface;

public class BMW implements AutoMobile{

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW iX 2025";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 40000000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "black";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getModel()+"\t"+getPrice()+"\t"+getColor();
	}
}
