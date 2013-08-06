import cdp.jsf.A;
import cdp.jsf.B;
import cdp.zl.ZL_AH;
import cdp.zl.ZL_AZ;
import cdp.zl.ZL_BH;
import cdp.zl.ZL_BZ;
import cdp.zxf.ZXF;


public class Main_Right {
	public static void main(String[] args) {
		A a=new A();			//��������A
		B b=new B();			//��������B
		
		ZL_AH aH=new ZL_AH(a);	//����A ��(H)����ָ��(ZL)
		ZL_AZ aZ=new ZL_AZ(a);	//����A ��(Z)����ָ��(ZL)
		ZL_BH bH=new ZL_BH(b);	//����B ��(H)����ָ��(ZL)
		ZL_BZ bZ=new ZL_BZ(b);	//����B ��(Z)����ָ��(ZL)
		
		ZXF ww=new ZXF();		//ָ��ִ����(ZXZ):����
		
		ww.zx(aH);				//����ִ��(zx)A������
		ww.zx(bH);				//����ִ�� B������
		ww.zx(bZ);				//����ִ�� B������
		ww.zx(bZ);				//����ִ�� B������
		ww.zx(bZ);				//����ִ�� B������
		ww.zx(aZ);				//����ִ�� A������
	}
}
