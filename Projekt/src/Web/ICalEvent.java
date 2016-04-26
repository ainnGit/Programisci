package Web;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ICalEvent {
	
	private final class EventData{
		
		private String title;
		private SimpleDateFormat dateFormat;
		private Calendar startDate;
		private Calendar endDate;
		private String location;
		private URL url;
		
		void test(String date){
			dateFormat = new SimpleDateFormat("dd.MM.yyyy z HH:mm");
			
			startDate = Calendar.getInstance();
			try{startDate.setTime(dateFormat.parse(date));} catch(ParseException e){}		
		} 
		
		public String getTitle(){ return this.title; }
		public Calendar getStartDate(){ return this.startDate; }
		public Calendar getEndDate(){ return this.endDate; }
		public String getLocation(){ return this.location; }
		public URL getURL(){ return this.url; }
	}
	EventData data = new EventData();
	
	public static void main(String[] args) throws ParseException{
		new ICalEvent();
	}
	
	public ICalEvent(){
		data.test("12.02.2014 GMT 13:24");
		
		String a = "tytul;#=dataStart;#=dataEnd;#=hour;#=location;#=url";
		String[] b = a.split(";#=");

		for (String string : b) {
			if(string.length() == 0)
				continue;
			System.out.println(string);
		}
	}
}
