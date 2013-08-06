package cdp.zl;

import cdp.jsf.JSF;


public class ZL_AH implements ZL{
	JSF yq;
	public ZL_AH(JSF rc){
		this.yq=rc;
	}
	@Override
	public void execute() {
		yq.b1();
		yq.b2();
		yq.b1();
		yq.b1();
		yq.b1();
	}
}
