package com.testcase;
//learning code practice
import java.io.IOException;

public class Wmhrmpim {

	public static void main(String[] args)throws IOException {
		//WebDriver driver();
		WrapperMethod wm = new WrapperMethod();
		wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		wm.byxpath_sendkey("//*[@id=\"txtUsername\"]", "Admin");
		wm.byxpath_sendkey("//*[@id=\"txtPassword\"]", "admin123");
		wm.byid_click("btnLogin");
		wm.byid_click("menu_pim_viewPimModule");
		wm.byid_click("btnAdd");
		wm.byxpath_sendkey("//*[@id=\"firstName\"]", "saveetha");
		wm.byxpath_sendkey("//*[@id=\"lastName\"]", "prabaharan");
	}

}
