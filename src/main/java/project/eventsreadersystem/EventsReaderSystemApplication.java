package project.eventsreadersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import project.eventsreadersystem.service.MyRunnable;
import project.eventsreadersystem.service.SchedulerTread;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EventsReaderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsReaderSystemApplication.class, args);
		/*MyRunnable myRunnable = new MyRunnable(10);
		Thread t = new Thread(myRunnable);
		t.start();*/
		SchedulerTread schedulerTread = new SchedulerTread();
		schedulerTread.start();
	}

}
