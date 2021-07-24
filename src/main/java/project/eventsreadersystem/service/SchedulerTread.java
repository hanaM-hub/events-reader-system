package project.eventsreadersystem.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import project.eventsreadersystem.entity.Request;
import project.eventsreadersystem.entity.Root;

import java.io.*;

@Service
public class SchedulerTread extends Thread {
    @Value("${timer}")
    private int timer;
    @Value("${fileRequest.path}")
    private String pathFile;

    public void run() {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while (true) {
            System.out.println(this.getName() + ": New Thread is running..." + i++);
            try {
                getEventsReader();
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void getEventsReader(){
        try {
            String jhjg = pathFile;
            File file = new File("/Users/Public/Request.xml");
            XmlMapper xmlMapper = new XmlMapper();
            String xml = inputStreamToString(new FileInputStream(file));
            Root value = xmlMapper.readValue(xml, Root.class);
        } catch (Exception e) {

        }
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}