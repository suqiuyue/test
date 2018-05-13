package policy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

import javax.ws.rs.core.MediaType;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by sqy on 2018/4/25.
 */
public class OperationGson {

    private String storeDir ="./jsonTest.json";
    private Gson gson = new GsonBuilder().create();

    public boolean saveToJson(RangerPolicy policies){
        boolean flag = false;
        if(policies != null){
            Writer writer = null;
            if(!flag){
                try {
                    File jsonFile = storeDir ==null? null :new File("./jsontest.json");
                    writer = new FileWriter(jsonFile);
                    String jsString = gson.toJson(policies);

                    sendToServer(jsString);
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    if(writer !=null){
                        try {
                            writer.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            flag = true;
         }
         return flag;
    }
    public void sendToServer(String Json){
        String path = "http://10.0.0.42:6080/service/public/v2/api/policy/";
        ClientResponse response = null;
        try {
            URI uri = new URI(path);
            Client client = Client.create();
            client.addFilter(new HTTPBasicAuthFilter("admin","admin"));
            WebResource webResource = client.resource(uri);
            response = webResource.accept(MediaType.APPLICATION_JSON_TYPE).type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,Json);
            System.out.println(response.getStatus());
            System.out.println("result : " + response.getEntity(String.class));

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
    public RangerPolicy loadFromJson(){
        RangerPolicy polices = null;
        File jsonFile = storeDir ==null? null :new File("./jsontest.json");
        if(jsonFile !=null && jsonFile.isFile() && jsonFile.canRead()){
            Reader reader =null;
            try {
                reader = new FileReader(jsonFile);
                polices = gson.fromJson(reader,RangerPolicy.class);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                if(reader !=null){
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return polices;

    }
}
