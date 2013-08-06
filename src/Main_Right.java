import cdp.jsf.A;
import cdp.jsf.B;
import cdp.zl.ZL_AH;
import cdp.zl.ZL_AZ;
import cdp.zl.ZL_BH;
import cdp.zl.ZL_BZ;
import cdp.zxf.ZXF;


public class Main_Right {
	public static void main(String[] args) {
		A a=new A();			//构建仪器A
		B b=new B();			//构建仪器B
		
		ZL_AH aH=new ZL_AH(a);	//仪器A 横(H)向震动指令(ZL)
		ZL_AZ aZ=new ZL_AZ(a);	//仪器A 纵(Z)向震动指令(ZL)
		ZL_BH bH=new ZL_BH(b);	//仪器B 横(H)向震动指令(ZL)
		ZL_BZ bZ=new ZL_BZ(b);	//仪器B 纵(Z)向震动指令(ZL)
		
		ZXF ww=new ZXF();		//指令执行者(ZXZ):王五
		
		ww.zx(aH);				//王五执行(zx)A横向震动
		ww.zx(bH);				//王五执行 B横向震动
		ww.zx(bZ);				//王五执行 B纵向震动
		ww.zx(bZ);				//王五执行 B纵向震动
		ww.zx(bZ);				//王五执行 B纵向震动
		ww.zx(aZ);				//王五执行 A纵向震动
	}
}
