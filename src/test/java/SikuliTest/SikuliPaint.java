package SikuliTest;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class SikuliPaint {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		
		Screen scr = new Screen();
		Pattern data = new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692438560654.png");
		
		scr.click(data);
		scr.type(data,"paint");
		
		Robot ro = new Robot();
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
		
		//click on the paint Symbol
		Pattern data1=new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692431367077.png");
		scr.click(data1);
		//select the yellow colour pallet
		Pattern data2=new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692431542317.png");
		scr.click(data2);
		//Click on the white screen to change the background
		Pattern data3=new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692431618167.png");
		scr.click(data3);
		
		//Click on the Square Icon		
		Pattern data4=new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692431875075.png");
		scr.click(data4);
		
		//Select the black colour
		Pattern data8=new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692434343750.png");
		scr.click(data8);
		
		//click on the line size
		Pattern data6=new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692432190271.png");
		
		scr.click(data6);
		
		//click on the line thickness
		Pattern data7=new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692433207364.png");
		scr.click(data7);
		
				
		Pattern data9=new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692438852614.png");
		scr.click(data4);
		
		scr.drag(data9);
		
	
		
		
		
		
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
