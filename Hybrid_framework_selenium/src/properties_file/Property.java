package properties_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property {
	@Test
	public void test2() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./property.properties"));
		String value = p.getProperty("key");
		System.out.println(value);
	}

}
