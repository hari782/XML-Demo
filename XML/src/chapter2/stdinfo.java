package chapter2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class stdinfo extends DefaultHandler{
	boolean stname = false, stemail = false, stroll = false,stmob = false;
	
@Override
public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	if(qName.equals("student")) {
		String rno = attributes.getValue("rollno");
		System.out.println("Roll No : "+rno);
	} else if (qName.equals("name")) {
		stname = true;
	} else if (qName.equals("email")) {
		stemail = true;
	} else if(qName.equals("mobile")) {
		stmob = true;
	} else if(qName.equals("reg")) {
		stroll = true;
	}
	
}

@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
	
	if(stname==true) {
		String stdn = new String(ch,start,length);
		System.out.println("Student name : "+stdn);
		stname=false;
	}
	if(stemail==true) {
		String stde = new String(ch,start,length);
		System.out.println("Email ID : "+stde);
		stemail=false;
	}
	if(stmob==true) {
		String stdm = new String(ch,start,length);
		System.out.println("Mobile num : "+stdm);
		stmob=false;
	}
	if(stroll==true) {
		String stdr = new String(ch,start,length);
		System.out.println("Roll No : "+stdr);
		stroll=false;
	}
		
	}

@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("student")) {
			System.out.println("**********************************");
		}
	}
}
