package cdp.zl;

import cdp.jsf.JSF;

public class ZL_AZ implements ZL{
	JSF yq;
	public ZL_AZ(JSF rc){
		this.yq=rc;
	}
	@Override
	public void execute() {
		yq.b2();
		yq.b1();
		yq.b2();
	}
}
