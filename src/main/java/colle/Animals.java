package colle;

public class Animals extends Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals an=new Animals();
		an.tiger();
		
	}
	public void deer()
	{
		System.out.println("deer");
	}
	public void elephant()
	{
		System.out.println("Elephant");
	}
	@Override
	public void monkey() {
		// TODO Auto-generated method stub
		System.out.println("monkey");
	}
	@Override
	public void tiger() {
		// TODO Auto-generated method stub
		System.out.println("tiger");
	}

}
