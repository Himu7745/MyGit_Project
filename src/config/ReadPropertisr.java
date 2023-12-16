package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertisr {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + "/config.properties";
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(filePath);
		prop.load(ip);
		String s = prop.getProperty("userName");
		System.out.println(s);

		System.out.println(prop.getProperty("browser"));
		// String location = System.getProperty("user.dir");
		//System.out.println(System.getProperty("user.dir"));

	}

}
