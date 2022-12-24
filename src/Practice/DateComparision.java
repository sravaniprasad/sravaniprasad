package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class DateComparision {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		String reqDate="20/06/1900";
		String startDate="26/06/1979";
		String endDate="26/12/2022";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		
		Date sDate=sdf.parse(startDate);
		Date eDate=sdf.parse(endDate);
		Date date=sdf.parse(reqDate);
		
		if(date.compareTo(sDate)>=0 && date.compareTo(eDate)<=0) {
			System.out.println("required date is with in the limit");
			
		}else {
			System.out.println("Date is out of range");
		}
		
		
		
		LocalDateTime d1 =LocalDateTime.of(2022,12,1,11,40,40);
		LocalDateTime d2 =LocalDateTime.of(2020,11,10,10,40,40);
		
		Duration duration=Duration.between(d1, d2);
		
		System.out.println(duration.getSeconds());
		
		
//		LocalDate d3 =LocalDate.of(2022,12,1);
//		LocalDate d4 =LocalDate.of(2020,11,10);
//		
//		Period period = Period.between(d4, d3);
//		
//		System.out.println(period.getDays());
//		System.out.println(period.getYears());
//		System.out.println(period.getMonths());
		
		
//		Date date1=sdf.parse("26/06/1979");
//		Date date2=sdf.parse("24/06/1999");
		LocalDate d5 =LocalDate.of(2022,12,13);
		LocalDate d6 =LocalDate.of(1979,06,26);
		Period period1 = Period.between(d6, d5);
		int days=period1.getDays();
		int months=period1.getMonths();
		int years=period1.getYears();
		System.out.println("Mummy's age is: "+years+" years "+months+" months "+days+" days");

		
		LocalDate d7 =LocalDate.of(1999,06,24);
		LocalDate d8 =LocalDate.of(1979,06,26);
		Period period2 = Period.between(d8, d7);
		
		int days1=period2.getDays();
		int months1=period2.getMonths();
		int years1=period2.getYears();
		System.out.println("=====================================================");
		System.out.println("Comparing dates from "+d8+ " to "+d7);
		System.out.println("Mummy's is: "+years1+" years elder than me" );

				
	}

}
