package project.eventsreadersystem.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import project.eventsreadersystem.entity.Request;

import java.io.*;

@Service
public class ReaderService extends Thread {
    @Value("${timer}")
    private int timer;
    @Value("${fileRequest.path}")
    private String pathFile;

    public void run() {
        while (true) {
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
            File file = new File("/Users/Public/Request.xml");
            XmlMapper xmlMapper = new XmlMapper();
            String xml = inputStreamToString(new FileInputStream(file));
            Request value = xmlMapper.readValue(xml, Request.class);
        } catch (Exception e) {

        }
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        br.readLine();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
