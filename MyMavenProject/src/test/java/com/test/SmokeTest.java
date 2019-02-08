package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bit.help.Scenario;

public class SmokeTest {
	
	@Test
	public void test34() throws FileNotFoundException, UnsupportedEncodingException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.bankrate.com");
		writeTxt(dr.findElements(By.xpath(".//*[@id='csstyle']/div[2]/header/nav/ul/li/a")));
	}
	
	
	public void writeTxt(List<WebElement> ele) throws FileNotFoundException, UnsupportedEncodingException
	{
		Writer writer = null;

		try {

		   int random = (int )(Math. random() * 500 + 1);
		    writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("./data/file"+random+".txt"))));
		   
		    for (WebElement e: ele)
			{
		    	 writer.write(e.getText()); 
		    	 writer.write(System.lineSeparator());
						
						
			}
		    
		    
		    
		    
		    
		    
		   
		} catch (IOException ex) {
		    // Report
			System.out.println(ex.getMessage());
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
		
	}
			



	
	
	
	
	void click(List<WebElement> ele,int i)
	{
		
				ele.get(i).click();
	
	}
	
	
	void click(List<WebElement> ele,String text)
	{
		
				for (WebElement e: ele)
				{
					if( e.getText().equals(text)) 
							{
						e.click();
							}
							
							
				}
	
	}
	
	
	
	
	
	String[] xyz1(List<WebElement> ele)
	{
		String actvalue[] = new String [ele.size()];
				int i = 0;
				for (WebElement e: ele)
				{
					actvalue[i]= e.getAttribute("id"); 
							i++;
							
				}
	return actvalue ;
	}
	
	
	
	
	
	
	String[] xyz(List<WebElement> ele)
	{
		String actvalue[] = new String [ele.size()];
				int i = 0;
				for (WebElement e: ele)
				{
					actvalue[i]= e.getText(); 
							i++;
							
				}
	return actvalue ;
	}
	
	public void compare(String [] exV,String [] acV)
	{
		for(int i=0;i<exV.length;i++)
		{
			if(exV[i]==acV[i])
			{
				System.out.println("matched");
			}
		}
	}
	@Test
	public void test13()
	{
		String [] e= {"Men","Women"};
		
		String a[]=xyz(dr.findElements(By.xpath("")));
		compare(e,a);
		
	}
	
	
	
	
	
	
	
	
	
	WebDriver dr;
	
	
	@Test
	public void test3()
	{
		
		Logger log=Logger.getLogger(SmokeTest.class);
		log.fatal("fatal");
		log.error("error");
		log.warn("warn");
		log.info("info");
		log.debug("debug");
		log.trace("trace");
	}
	@Test(dataProvider="login")
	public void loginValidation(Object o,Object o1)
	{
		
		dr.findElement(By.id("")).sendKeys(o.toString());
		dr.findElement(By.id("")).sendKeys(o1.toString());
	}
	
	
	
	
	@DataProvider(name="login")
	public Object[][] readXl() throws IOException
	{
		FileInputStream f=new FileInputStream(new File("location of file"));
		XSSFWorkbook book=new XSSFWorkbook(f);
		XSSFSheet sheet=book.getSheetAt(0);
		//sheet.getRow(1).getCell(1).getStringCellValue();
		
		Object[][] datas=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				XSSFCell cell=sheet.getRow(i).getCell(j);
				if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
				{
					datas[i-1][j] =cell.getNumericCellValue();
				}
				else if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING)
				{
					datas[i-1][j] =cell.getStringCellValue();
				}
				
			}
		}
		return datas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	FileReader f=null;
	BufferedReader bf=null;
	@Test
	public void test1() throws IOException 
	{
		StringBuffer sb=new StringBuffer();
		
		try
		{
			f=new FileReader(new File("/Users/bittechconsulting/eclipse-workspace/MyMavenProject/book1.txt"));
			bf=new BufferedReader(f);
			String line=bf.readLine();
			while(line!=null)
			{
				
				sb.append(line).append(System.lineSeparator());
				
				line=bf.readLine();
			}
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
			e.getMessage();
			System.out.println("file not found");
		}
		catch(Exception e1)
		{
			
		}
		finally
		{
			f.close();
			bf.close();
		}
		System.out.println(sb);
		System.out.println("continue");
		
	}
	
	
	

}
