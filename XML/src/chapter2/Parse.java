package chapter2;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class Parse {

	public static void main(String[] args) {
		try {
			
			stdinfo si = new stdinfo();
			File f = new File("C:\\Users\\HP\\Downloads\\XML\\student.xml");
			SAXParserFactory sf = SAXParserFactory.newInstance();
			SAXParser sp = sf.newSAXParser();
			sp.parse(f, si);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
