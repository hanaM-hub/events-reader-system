package project.eventsreadersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import project.eventsreadersystem.service.ReaderService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EventsReaderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsReaderSystemApplication.class, args);
		ReaderService readerService = new ReaderService();
		readerService.start();
	}

}
