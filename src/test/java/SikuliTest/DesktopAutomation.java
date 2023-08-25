package SikuliTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.basics.*;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DesktopAutomation {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		Screen scr=new Screen();
		
		Pattern data=new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692438595634.png");
		scr.click(data);
		scr.type(data, "notepad");
		Robot ro = new Robot();

		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern data1 = new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692428831850.png");
		
		scr.click(data1);
		
		scr.type(data1, "I can solve problems easily.I have a problem solving skill.I am proud of My self.I love my children.");
		
		
		Pattern data2 = new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692430403570.png");
		
		scr.click(data2);
		
		Pattern data3 = new Pattern("C:\\Users\\mamta\\eclipse-workspace\\WECO33\\coreJavaPrograms\\DemoSikuli\\1692441955953.png");
		
		scr.click(data3);
	}

}//Pull practice using gitbash cmd
