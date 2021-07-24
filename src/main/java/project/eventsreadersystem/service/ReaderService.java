package project.eventsreadersystem.service;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import project.eventsreadersystem.entity.Request;

import java.io.*;

@Service
public class ReaderService {
    @Value("${fileRequest.path}")
    private String pathFile;

    public void getEventsReader(){
        try {
            File file = new File(pathFile);
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
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }
}
