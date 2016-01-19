package com.example.web;

import java.util.Date;

import org.junit.Test;
import org.ocpsoft.prettytime.PrettyTime;

public class TestMain {
	
	@Test
	public void printDate() {
		PrettyTime p = new PrettyTime();
		System.out.println(p.format(new Date()));
		//prints: “moments from now”

		System.out.println(p.format(new Date(System.currentTimeMillis() + 1000*60*10)));
		
		PrettyTime t = new PrettyTime(new Date(0));
		System.out.println(t.format(new Date(1000 * 60 * 60 * 24 * 7 * 3)));
	}
}
