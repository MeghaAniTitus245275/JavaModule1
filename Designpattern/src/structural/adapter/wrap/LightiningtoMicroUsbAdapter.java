package structural.adapter.wrap;

import structural.adapter.phoneifaces.LightningPhone;
import structural.adapter.phoneifaces.MicroUsbPhone;
import structural.adapter.phoneimpl.Iphone;

public class LightiningtoMicroUsbAdapter implements MicroUsbPhone {
	private LightningPhone lightningPhone;
		// TODO Auto-generated constructor stub
	

	public LightiningtoMicroUsbAdapter(LightningPhone lightningPhone) {
	        this.lightningPhone = lightningPhone;
	    }

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
        lightningPhone.recharge();

	}

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		 System.out.println("MicroUsb connected");
	        lightningPhone.useLightning();

	}

}
