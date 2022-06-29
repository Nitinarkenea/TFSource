package testjava;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import mainjava.BaseClass;

public class DashboardPageTest extends BaseTest {

	@Test(priority=16)
	public void verifyDashBoardTest() throws InterruptedException
	{
		dash.thirdPartFigures();
		
	}
	
	@Test(priority=17)
	public void verifyJapanese() throws InterruptedException
	{
		dash.verifyJapanese();
	
		
	}
	
	@Test(priority=18)
	public void verifyHasBroProduct() throws InterruptedException
	{
		dash.verifyHasbro();
	
		
	}
	
	@Test(priority=19)
	public void verifyVintageProduct() throws InterruptedException
	{
		dash.verifyVintage();
	
		
	}
	
	@Test(priority=20)
	public void verifyExclusivesProduct() throws InterruptedException
	{
		dash.verifyExclusives();
	}
	
	@Test(priority=21)
	public void verifyCheckOut() throws IOException
	{
		dash.verifyCheckOut();
	}


	@Test(priority=22)
	public void verifychooseShippingOption() throws InterruptedException
	{
		dash.chooseShippingOption();
	}
	
	@Test(priority=23)
	public void verifyOrder() throws InterruptedException, AWTException
	{
		dash.placeOrder();
	}
	
	
	@Test(priority=24)
	public void verifyingShipngAddress() throws InterruptedException, AWTException, IOException
	{
	dash.shipmyStack();	
	}
	
	@Test(priority=25)
	public void verifyProductSelection() throws InterruptedException
	{
		dash.productSelection();
	}
	
	
	@Test(priority=26)
	public void verifyingPlaceOder() throws InterruptedException
	{
		dash.toPlaceorder();
	}
	
	@Test(priority=27)
	public void verifyOrderDetails() throws InterruptedException
	{
		dash.orderDetails();
	}
	
	@Test(priority=28,invocationCount = 2)
	public void verifyproductSelection() throws InterruptedException, AWTException, IOException
	{
		dash.repetation();
	}
	
	
	
	@Test(priority=29)
	public void logout()
	{
		dash.logout();
	}
	
}
