package cdp.zl;

import cdp.jsf.JSF;

public class ZL_BZ implements ZL{
	JSF yq;
	public ZL_BZ(JSF rc){
		this.yq=rc;
	}
	@Override
	public void execute() {
		yq.b1();
		yq.b2();
		yq.b1();
		yq.b2();
		yq.b1();
	}
}
