package com.example.demo;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController

public class CurrenttimeprojectApplication {
	
	@GetMapping("/datetime")
	public String getMapping(){
		Calendar re = Calendar.getInstance();
	    Date da=re.getTime();
	    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    String currentdateandtime=dateFormat.format(da);
	    System.out.println(currentdateandtime);
	    return"Current date and  time of the day using Calendar - 24 hour format: "+ currentdateandtime;
	}


	public static void main(String[] args) {
		SpringApplication.run(CurrenttimeprojectApplication.class, args);
	}

}
