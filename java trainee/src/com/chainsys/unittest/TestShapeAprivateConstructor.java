package com.chainsys.unittest;

import com.chainsys.oops.ShapeAPrivateConstructor;

public class TestShapeAprivateConstructor {

	public static void testPrivateConstructor() {
		ShapeAPrivateConstructor refShapeA=
				ShapeAPrivateConstructor.getobject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}
}
