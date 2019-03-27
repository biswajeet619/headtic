package com.dbs.training.demoproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class greetaa {

	@Test
	public void test() {
		App ap=new App();
		String jj=ap.greet();
		assertEquals("hello",jj);

}

}	