import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY hh:mm:ss");
		System.out.println(sdf.format(d));
		
	}

}
