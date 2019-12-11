package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class GerarDadosUtils {

	
	public static XMLGregorianCalendar retornaDataXMLGregorian(Date date) {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
		}
		return null;
	}
	
	
    public static String retornaDataFormatoString() {
        LocalDateTime now = LocalDateTime.now();
        String format =
                now.format(DateTimeFormatter.ofPattern("yyyyMMddmmss", Locale.ENGLISH));
        return format.toString();
    }

}
