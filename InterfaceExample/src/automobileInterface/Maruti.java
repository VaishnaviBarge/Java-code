package automobileInterface;

public class Maruti implements AutoMobile{

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Maruti-wagenor";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "solid-black";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getModel()+"\t"+getPrice()+"\t"+getColor();
	}
	
}
