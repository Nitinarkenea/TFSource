package mainjava;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;



public class DashboardPage extends BaseClass {

	@FindBy(xpath = "//*[@id='details-button']")
    WebElement advance;
    @FindBy(xpath = "//*[@id='proceed-link']")
    WebElement proceedlink;
	//3rd PartFigure 
    @FindBy(xpath = "//*[@id='catDropdown']//li//a[text()='3rd Party Figures']")
    WebElement thirdparty;
    @FindBy(xpath = "//strong[text()='3rd Party Figures']")
    WebElement thridPartyFigure;

    //firstorder
    @FindBy(xpath = "//*[@class='itemName']//a[text()='MTRM-13 Lightning Wing Fillers | MakeToys Re: Master Series']")
    WebElement firstorder;
    //addcart
    @FindBy(xpath = "//input[@name='add_carrt']")
    WebElement addcart;
    //checkout
    @FindBy(xpath = "//*[text()='Proceed to Checkout']")
	WebElement Checkout;
    //close popup
    @FindBy(xpath = "//*[@class='modal_close']")
    WebElement pop;
    
  //continue shopping
  	@FindBy(xpath = "//a[text()='Continue Shopping']")
  	WebElement contineshopping;
  	
  	@FindBy(xpath = "//*[@id='catDropdown']//li//a[text()='Japanese']")
  	WebElement japanese;
  	@FindBy(xpath = "//strong[text()='Japanese Transformers']")
  	WebElement japaneseTransformers;
  	@FindBy(xpath = "//div[@class='itemName']//a[text()='MP-12 Sideswipe Lambor Collectors Coin | Transformers Masterpiece']")
  	WebElement secondorder;
  	
  	@FindBy(xpath = "//*[@id='catDropdown']//li//a[text()='Hasbro']")
  	WebElement Hasbro;
  	@FindBy(xpath = "//strong[text()='Hasbro Transformers']")
  	WebElement hasbrotransformer;
  	@FindBy(xpath = "//div[@class='itemName']//*[text()='WFC-K3 Vertebreak Core Class | Transformers Generations War for Cybertron Kingdom Chapter']")
  	WebElement thirdOrder;
  	
  	@FindBy(xpath = "//*[@id='catDropdown']//li//a[text()='Vintage']")
  	WebElement vintage;
  	@FindBy(xpath = "//strong[text()='Vintage Transformers']")
  	WebElement vintagetransformer;
  	@FindBy(xpath = "//div[@class='itemName']//*[text()='Voyager Class Autobot Drift | Transformers 4 Age of Extinction AOE']")
  	WebElement FourthOrder;
  	
  	@FindBy(xpath = "//*[@id='catDropdown']//li//a[text()='Exclusives']")
  	WebElement exclusive;
  	@FindBy(xpath = "//strong[text()='Transformers Exclusives']")
  	WebElement exclusivetransformer;
  	@FindBy(xpath = "//div[@class='itemName']//*[text()='Soleron Drivers 6 Pack Online Exclusive | Fansproject Lost Exo Realm']")
  	WebElement FifthOrder;
   //proceed to checkout
  	@FindBy(xpath = "//a[text()='Proceed to Checkout']")
  	WebElement checkout;
  	@FindBy(id = "username")
  	WebElement user;
  	@FindBy(id = "password")
  	WebElement password;
  	@FindBy(id = "signIn")
  	WebElement signIn;
  	
  	@FindBy(xpath = "//*[@class='col-6 shipping-billing-address']//p//a")
	WebElement address;
	@FindBy(xpath ="//*[@title=\"Add New Shipping Address\"]")
	WebElement newaddress;
	@FindBy(xpath = "//*[@id='lb_ship_first_name']")
	WebElement NDF_Name;
	@FindBy(xpath = "//*[@id='lb_ship_last_name']")
	WebElement NDL_Name;
	@FindBy(xpath = "//*[@id='lb_ship_address1']")
	WebElement NDA_Name;
	@FindBy(xpath = "//*[@id='lb_ship_address2']")
	WebElement NDA2_Name;
	@FindBy(xpath = "//*[@id='lb_ship_country']")
	WebElement NDC_Name;
	
	@FindBy(xpath = "//*[@id='lb_ship_zip']")
	WebElement NDZ_Name;
	@FindBy(xpath = "//*[@id='lb_ship_city']")
	WebElement NDCity_Name;
	@FindBy(xpath = "//*[@id='lb_ship_state']")
	WebElement NDState_Name;
	@FindBy(xpath = "//*[@id='lb_ship_phone']")
	WebElement NDPhone_Name;
	@FindBy(xpath = "//span[contains(text(),'Use this address as my billing information')]")
	WebElement billingAddress;
	@FindBy(xpath = "//*[@id='shipping_update']")
	WebElement ship;
	
	@FindBy(xpath = "//*[@id='add_to_stack']")
	WebElement ChooseOption;
	
	@FindBy(xpath = "//*[@id='checkout_submit']")
	WebElement PlaceOrder;
  
  	
    public DashboardPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
    
    public void thirdPartFigures() throws InterruptedException
	{
    	WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(5));
    	advance.click();
    	proceedlink.click();
		Actions act = new Actions(driver);
		act.moveToElement(thirdparty).perform();
		thridPartyFigure.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
	    Thread.sleep(1000);
		List<WebElement> sorting=driver.findElements(By.xpath("//*[@id='sort-by']//optgroup//option"));
		for(WebElement sort:sorting)
		{
			if(sort.getText().equals("Price: Lowest First"))
			{
				sort.click();
			}
		}
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(firstorder));
		firstorder.click();
		
		addcart.click();
		Reporter.log("First product selected from ThirdParty Figure", true);
	
		Thread.sleep(2000);
		
		
	}
    public void verifyJapanese() throws InterruptedException
	{
    	WebDriverWait wait1 = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10));
		wait1.until(ExpectedConditions.elementToBeClickable(japanese));
		Actions act = new Actions(driver);
		act.moveToElement(japanese).perform();
		japaneseTransformers.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> sorting=driver.findElements(By.xpath("//*[@id='sort-by']//optgroup//option"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(1000);
		for(WebElement sort:sorting)
		{
			if(sort.getText().equals("Price: Lowest First"))
			{
				sort.click();
			}
		}
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(20));
		wait.until(ExpectedConditions.elementToBeClickable(secondorder));
		
		secondorder.click();
		
	    addcart.click();
	    Reporter.log("Second product selected from Japanese", true);
	    Thread.sleep(3000);
				
}
    
    public void verifyHasbro() throws InterruptedException
	{
    	WebDriverWait wait1 = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10));
		wait1.until(ExpectedConditions.elementToBeClickable(Hasbro));
		Actions act = new Actions(driver);
		act.moveToElement(Hasbro).perform();
		hasbrotransformer.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> sorting=driver.findElements(By.xpath("//*[@id='sort-by']//optgroup//option"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(1000);
		for(WebElement sort:sorting)
		{
			if(sort.getText().equals("Price: Lowest First"))
			{
				sort.click();
			}
		}
		Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(20));
		wait.until(ExpectedConditions.elementToBeClickable(thirdOrder));
		
		thirdOrder.click();
		
	    addcart.click();
	    Reporter.log("Third product selected from HasBro", true);
	   
				
}
    public void verifyVintage() throws InterruptedException
	{
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	WebDriverWait wait1 = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10));
		wait1.until(ExpectedConditions.elementToBeClickable(vintage));
		Actions act = new Actions(driver);
		act.moveToElement(vintage).perform();
		vintagetransformer.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> sorting=driver.findElements(By.xpath("//*[@id='sort-by']//optgroup//option"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		for(WebElement sort:sorting)
		{
			if(sort.getText().equals("Price: Lowest First"))
			{
				sort.click();
			}
		}
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10));
		wait.until(ExpectedConditions.elementToBeClickable(FourthOrder));
		
		FourthOrder.click();
		
	    addcart.click();
	    Reporter.log("Fourth product selected from Vintage", true);
	    Thread.sleep(2000);
				
}
    
    public void verifyExclusives() throws InterruptedException
	{
    	WebDriverWait wait1 = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(10));
		wait1.until(ExpectedConditions.elementToBeClickable(exclusive));
		Actions act = new Actions(driver);
		act.moveToElement(exclusive).perform();
		exclusivetransformer.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> sorting=driver.findElements(By.xpath("//*[@id='sort-by']//optgroup//option"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(1000);
		for(WebElement sort:sorting)
		{
			if(sort.getText().equals("Price: Lowest First"))
			{
				sort.click();
			}
		}
		Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toMillis(20));
		wait.until(ExpectedConditions.elementToBeClickable(FifthOrder));
		
		FifthOrder.click();
		
	    addcart.click();
	    Reporter.log("Fifth product selected from Exclusive", true);
	    Thread.sleep(2000);
				
}
    
    public void verifyCheckOut() throws IOException
    {
    	checkout.click();
    	FileInputStream loader = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\TFSite\\config.properties");
		Properties prop = new Properties();
		prop.load(loader);
    	
    	user.sendKeys(prop.getProperty("UserName"));
    	password.sendKeys(prop.getProperty("Password"));
    	  	signIn.click();
    	  	Reporter.log("Added all items into Cart", true);
    }
    
    
    
    public void chooseShippingOption() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		ChooseOption.click();
		Thread.sleep(3000);
		Reporter.log("Choose Shiping option-All items to my stack", true);
	}
   
    public void placeOrder() throws InterruptedException, AWTException{
			
		
		PlaceOrder.click();
		Reporter.log("Place your order", true);
		}
    
    
    public void shipmyStack() throws InterruptedException, AWTException, IOException
    {
    	
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    	FileInputStream loader = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\TFSite\\config.properties");
		Properties prop = new Properties();
		prop.load(loader);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		address.click();
		newaddress.click();
		NDF_Name.clear();
		NDF_Name.sendKeys(prop.getProperty("FirstName"));
		NDL_Name.clear();
		NDL_Name.sendKeys(prop.getProperty("LastName"));
		NDA_Name.clear();
		NDA_Name.sendKeys(prop.getProperty("Street"));
		NDA2_Name.clear();
		NDA2_Name.sendKeys(prop.getProperty("City"));
		Select selCountry=new Select(NDC_Name);
		String country=prop.getProperty("Country");
		if(country.equals("United States "))
		{
			Select selState= new Select(NDState_Name);
			selState.selectByVisibleText("California");
		}
		else
		selCountry.selectByVisibleText(country);
		NDZ_Name.clear();
		NDZ_Name.sendKeys(prop.getProperty("pincode"));
		NDCity_Name.clear();
		NDCity_Name.sendKeys(prop.getProperty("Location"));
		NDState_Name.sendKeys("Maharashtra");
				
		NDPhone_Name.clear();
		NDPhone_Name.sendKeys(prop.getProperty("MobileNumber"));
		ship.click();
		Reporter.log("Address selected", true);
		
		
    }
    
    public void productSelection() throws InterruptedException
    {
    	Thread.sleep(1000);
    	List<WebElement> products= driver.findElements(By.xpath("//*[@id='itemsListHold']//div[1]//div/table//tbody//tr"));
    	
		for(int i=3;i<products.size();i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='itemsListHold']//div[1]//div//table//tbody//tr["+i+"]//td[1]//label")).click();
				
		}
		Thread.sleep(1000);
    	
    	Reporter.log("Everytime select 2 Item", true);
    }
   
      	public void toPlaceorder() throws InterruptedException
    
    {
    		
    		
    	  		
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id='stack_submit_items']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id='submit_order_click']")).click();
    	Reporter.log("Order Place successfully", true);
		
    	
     }
      	
    
      	
    	public void orderDetails() throws InterruptedException
    	{
    		Thread.sleep(2000);
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,350)");
        	String OrderID=driver.findElement(By.xpath("//*[@id='myOrders']//div[2]//div[1]//div//div[1]//div[1]//span")).getText();
        	String itemsubTotal=driver.findElement(By.xpath("//*[@id='myOrders']//div[2]//div[1]//div//div[2]//div[2]//div[1]//p[2]")).getText();
        	String shipping=driver.findElement(By.xpath("//*[@id='myOrders']//div[2]//div[1]/div//div[2]//div[2]//div[2]//p[2]")).getText();
        	String grandTotal=driver.findElement(By.xpath("//*[@id='myOrders']//div[2]//div[1]//div//div[2]//div[2]//div[3]//p[2]")).getText();
        	Reporter.log("Order Summary ", true);  	
        	Reporter.log("Order ID: ",true);
        	Reporter.log(OrderID,true);
        	Reporter.log("Item and SubTotal: ",true);
        	Reporter.log(itemsubTotal,true);
        	Reporter.log("Shipping and Handling: ",true);
        	Reporter.log(shipping,true);
        	Reporter.log("Grand Total :",true);
        	Reporter.log(grandTotal,true);
        	String address=driver.findElement(By.xpath("//*[@id='myOrders']/div[2]/div[1]/div/div[2]/div[1]/p[2]")).getText();
        	Reporter.log("Delivery Address :",true);
        	Reporter.log(address,true);
        	
        	
    	}
    	public void shipmyStack2() throws InterruptedException, AWTException, IOException
        {
        	
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        	FileInputStream loader = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\TFSite\\config.properties");
    		Properties prop = new Properties();
    		prop.load(loader);
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		address.click();
    		newaddress.click();
    		NDF_Name.clear();
    		NDF_Name.sendKeys(prop.getProperty("fname"));
    		NDL_Name.clear();
    		NDL_Name.sendKeys(prop.getProperty("lname"));
    		NDA_Name.clear();
    		NDA_Name.sendKeys(prop.getProperty("street"));
    		NDA2_Name.clear();
    		NDA2_Name.sendKeys(prop.getProperty("city"));
    		Select selCountry=new Select(NDC_Name);
    		String country=prop.getProperty("Country");
    		if(country.equals("United States "))
    		{
    			Select selState= new Select(NDState_Name);
    			selState.selectByVisibleText("California");
    		}
    		else
    		selCountry.selectByVisibleText(country);
    		NDZ_Name.clear();
    		NDZ_Name.sendKeys(prop.getProperty("pinCode"));
    		NDCity_Name.clear();
    		NDCity_Name.sendKeys(prop.getProperty("location"));
    		NDState_Name.sendKeys("Karnataka");
    		
    		   				
    		NDPhone_Name.clear();
    		NDPhone_Name.sendKeys(prop.getProperty("MobNo"));
    		ship.click();
    		Reporter.log("Address selected", true);
    		
    		
        }
    	
    	public void repetation() throws InterruptedException, AWTException, IOException
      	{
    			Thread.sleep(3000);
	      		driver.findElement(By.xpath("//*[text()='Stack']")).click();
	      		Thread.sleep(2000);
	      		shipmyStack2();
	      		Thread.sleep(3000);
	      		productSelection();
	      		Thread.sleep(2000);
	      		toPlaceorder();
	      		Thread.sleep(1000);
	      		orderDetails();
	      		Thread.sleep(1000);
	      		
	      		
    		
      	}
    	
    	public void repetation2() throws InterruptedException, AWTException, IOException
      	{
	      		driver.findElement(By.xpath("//*[text()='Stack']")).click();
	      		Thread.sleep(2000);
	      		shipmyStack2();
	      		
	      		Thread.sleep(1000);
	      		productSelection();
	      		Thread.sleep(1000);
	      		toPlaceorder();
	      		Thread.sleep(1000);
	      		orderDetails();
	      		Thread.sleep(1000);
	      		
	      		
    		
      	}
    	    	
    	
    	
    	public void shipmyStack3() throws InterruptedException, AWTException, IOException
        {
        	       	
        	FileInputStream loader = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\TFSite\\config.properties");
    		Properties prop = new Properties();
    		prop.load(loader);
    		address.click();
    		newaddress.click();
    		NDF_Name.clear();
    		NDF_Name.sendKeys(prop.getProperty("Fname"));
    		NDL_Name.clear();
    		NDL_Name.sendKeys(prop.getProperty("Lname"));
    		NDA_Name.clear();
    		NDA_Name.sendKeys(prop.getProperty("STreet"));
    		NDA2_Name.clear();
    		NDA2_Name.sendKeys(prop.getProperty("Cty"));
    		Select selCountry=new Select(NDC_Name);
    		String country=prop.getProperty("COuntry");
    		if(country.equals("United States "))
    		{
    			Select selState= new Select(NDState_Name);
    			selState.selectByVisibleText("California");
    		}
    		else
    		selCountry.selectByVisibleText(country);
    		NDZ_Name.clear();
    		NDZ_Name.sendKeys(prop.getProperty("pin"));
    		NDCity_Name.clear();
    		NDCity_Name.sendKeys(prop.getProperty("loccation"));
    		NDState_Name.sendKeys("Maharashtra");
    				
    		NDPhone_Name.clear();
    		NDPhone_Name.sendKeys(prop.getProperty("MobileNo"));
    		ship.click();
    		Reporter.log("Address selected", true);
    		
        }
    	public void logout()
    	{
    		WebElement myaccount=driver.findElement(By.xpath("//*[text()='My Source']"));
    		Actions act = new Actions(driver);
    		act.moveToElement(myaccount).perform();
    		driver.findElement(By.xpath("//*[@id=\"secMenu\"]/li[1]/ul/li[5]/a")).click();
    		Reporter.log("Logout Successfully",true);
    	}
        
}

