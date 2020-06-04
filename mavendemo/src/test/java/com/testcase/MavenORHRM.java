package com.testcase;

//import com.test.common.CommonMethods;

import java.io.IOException;

//maven callwrapper

public class MavenORHRM {

			public static void main(String[] args)throws IOException, Exception {
			MavenORHRM mv=new MavenORHRM();
			mv.chrome_browser("https://opensource-demo.orangehrmlive.com/");
			mv.byid_sendkey("txtUsername", "Admin");
			mv.byid_sendkey("txtPassword", "admin123");
			mv.byxpath_click("//*[@id=\'btnLogin\']");
			mv.byxpath_click("//*[@id=\'menu_pim_viewPimModule\']/b");
			System.out.println("before");
			//Thread.sleep(1000);
			//mv.byid_click("btnAdd");
			Thread.sleep(1000);
			mv.byxpath_click("//*[@id=\'btnAdd\']");
			System.out.println("after");
			mv.byid_sendkey("firstName", "saveetha");
			mv.byid_sendkey("lastName", "prabaharan");
			mv.byid_sendkey("employeeId", "344388");
			System.out.println("after1111");
			//mv.fileupload("photofile", "D:\\Geetha\\Software\\path\\ttttt.png");
			mv.byxpath_click("btnSave");
			//mv.takesnap("D:\\Geetha\\Software\\path\\ORHRM.png");
			
					
			

	}

			private void chrome_browser(String string) {
				// TODO Auto-generated method stub
				
			}

			private void byid_sendkey(String string, String string2) {
				// TODO Auto-generated method stub
				
			}

			private void byxpath_click(String string) {
				// TODO Auto-generated method stub
				
			}

		
			
				
			}

