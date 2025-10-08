package automobileInterface;

public class Toyota implements AutoMobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Toyota Urban Cruiser EV";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 2500000;
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
