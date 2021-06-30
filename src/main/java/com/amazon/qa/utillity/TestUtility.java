package com.amazon.qa.utillity;

import java.util.Iterator;
import java.util.Set;

import com.amazon.qa.base.TestBase;

public class TestUtility extends TestBase {

	public TestUtility() throws Exception {
		super();
	}

	public void navigateToNextTab()
	{
		String MainWindow=driver.getWindowHandle();					
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    driver.switchTo().window(ChildWindow);	
            }
            
        }
	}
	
}
