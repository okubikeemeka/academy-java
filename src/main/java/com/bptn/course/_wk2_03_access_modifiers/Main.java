package com.bptn.course._wk2_03_access_modifiers;

public class Main {
	public static void main(String[] args) {
	
		PublicDemo myDemo = new PublicDemo("test");
		myDemo.displayName();
		
		myDemo.setName("");
		myDemo.displayName();
			
	}
}
