package automobileInterface;

public class HeroHonda implements Bike {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Mavrick 440";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 210000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public int getCce() {
		// TODO Auto-generated method stub
		return 440;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getModel()+"\t"+getPrice()+"\t"+getColor()+"\t"+getCce();
	}
}
