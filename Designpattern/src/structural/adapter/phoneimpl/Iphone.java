package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {

	private boolean connector;

	public void LightningPhone() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("LightiningPhone connected");

		
	}

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector)
		{
			System.out.println("recharge started");
			System.out.println("recharge finished");
		}
		else
		{
			System.out.println("connect LightiningPhone first");
		}
		
}

	@Override
	public void useLightning() {
		// TODO Auto-generated method stub
		
	}
}
