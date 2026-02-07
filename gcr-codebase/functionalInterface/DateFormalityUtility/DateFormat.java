package DateFormalityUtility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.w3c.dom.ls.LSOutput;

interface DateFormat {
	 static void format1() {
		 LocalDateTime nowDateTime= LocalDateTime.now();
		 DateTimeFormatter dateFormat= DateTimeFormatter.ofPattern("dd/mm/yyyy");
		 System.out.println(nowDateTime.format(dateFormat));
}
	 static void format2() {
		 LocalDateTime nowDateTime= LocalDateTime.now();
		 DateTimeFormatter dateFormat= DateTimeFormatter.ofPattern("mm-dd-yyyy");
		 System.out.println(nowDateTime.format(dateFormat));
}
}
