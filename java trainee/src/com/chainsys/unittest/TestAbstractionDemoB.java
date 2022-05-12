package com.chainsys.unittest;

import com.chainsys.oops.AbstractDemoB;
import com.chainsys.oops.DemoBChild;

public class TestAbstractionDemoB {
	
	public static void testDemoB() {
		// abstract class can not be instantiated
//		AbsDemoB objectDemob=new AbsDemoB();
		AbstractDemoB objectDemob=new DemoBChild();
		objectDemob.echo();
	}

}
