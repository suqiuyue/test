package policy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by sqy on 2018/4/25.
 */
public class OperationGson {

    private String storeDir ="./jsonTest.json";
    private Gson gson = new GsonBuilder().create();

    public void saveToJson(RangerPolicy policies){
        if(policies != null){
            Writer writer = null;
            try {
                File jsonFile = storeDir ==null? null :new File("./jsontest.json");
                writer = new FileWriter(jsonFile,true);
                gson.toJson(policies,writer);

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
