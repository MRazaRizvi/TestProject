package project_tello;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class project_tello {
	
	public static AndroidDriver driver;
	
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		
			
			 capabilities.setCapability("deviceName","emulator-5554");
			 capabilities.setCapability("platformName","Android");
		     capabilities.setCapability("platformVersion","11");	 
			 capabilities.setCapability("appActivity", "com.udna.tellotalk.ui.activities.SplashActivity" );
			 capabilities.setCapability("appPackage","com.udna.tellotalk");
				 
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

			 System.out.println("APP IS OPEN");
			 
			 getlanguage();
			 getlogin();
			 getmsgsending();
			 
			 
	}
	
	
	public static void getlanguage() throws InterruptedException {
		
		driver.findElementById("com.udna.tellotalk:id/english").click();
		 System.out.println("Language Selected");
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.udna.tellotalk:id/btn_language_selection_done")).click();
		 Thread.sleep(2000);
	}
	
	
     private static void getlogin() throws InterruptedException {
		
		
		
		 driver.findElement(By.id("com.udna.tellotalk:id/edt_phone_number")).sendKeys("03039084899");
		 driver.findElement(By.id("com.udna.tellotalk:id/btn_proceed_to_verification_sms")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("com.udna.tellotalk:id/txt_pin_entry")).sendKeys("121234");
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.udna.tellotalk:id/btn_signup_done")).click();
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/com.google.android.material.chip.Chip[14]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/com.google.android.material.chip.Chip[23]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/com.google.android.material.chip.Chip[29]")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("com.udna.tellotalk:id/btn_select_tags_done")).click();
		 Thread.sleep(2000);
		 
		
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		 Thread.sleep(2000);
		 System.out.println("App is Login!!!!!!!!!!!Hurraayyyyyy");
		 
		 
		 }
     
     
			
			  public static void getmsgsending() throws InterruptedException {
			  
			  driver.findElement(By.xpath(
			  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"
			  )).click(); Thread.sleep(5000);
			  System.out.println("Now Tab is Messaging");
			  driver.findElement(By.id("com.udna.tellotalk:id/new_chat_btn")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.id("com.udna.tellotalk:id/refresh_view")).click();
			  Thread.sleep(2000);
			  System.out.print("Search User"); 
			  Thread.sleep(2000);
			  
			  
	    	  driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Search\"]")).click();
	    	  Thread.sleep(2000);
	    	  driver.findElement(By.id("com.udna.tellotalk:id/search_src_text")).sendKeys("alpha");
	    	  Thread.sleep(2000);
	    	  driver.findElement(By.id("com.udna.tellotalk:id/upper_layout")).click();
	    	  
	    	  Thread.sleep(2000);
	    //	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup")).click();
	    //	  Thread.sleep(2000);
		  driver.findElement(By.id("com.udna.tellotalk:id/editMessage")).sendKeys("Hello World");
		      Thread.sleep(2000);
			  driver.findElement(By.id("com.udna.tellotalk:id/sendMessageBtn")).click();
			  
			  
			  
			  
			  
			  
			  }
			 
	
	
	
	
	
	
	

}
