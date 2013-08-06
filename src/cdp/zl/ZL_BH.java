package cdp.zl;

import cdp.jsf.JSF;

public class ZL_BH implements ZL{
	JSF yq;
	public ZL_BH(JSF rc){
		this.yq=rc;
	}
	@Override
	public void execute() {
		yq.b2();
		yq.b1();
		yq.b1();
		yq.b1();
	}
}
