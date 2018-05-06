import org.apache.hadoop.conf.Configuration;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by sqy on 2018/4/8.
 */
public class HdfsOperation {
    private static String SOURCE_PATH = "F:\\project";
    private static String DEST_PATH = "/test";
    private static String MASTER_URI = "hdfs://10.0.0.66:9000";
    public static void main(String[] args){
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","hdfs://10.0.0.66:9000");
        System.setProperty("HADOOP_USER_NAME","root");
        HdfsUtil util = new HdfsUtil();
        try {

            LocalDateTime startTime = LocalDateTime.now();
            System.out.println("starttime="+startTime);
            util.ls(conf,MASTER_URI,DEST_PATH);
            LocalDateTime endTime = LocalDateTime.now();
            System.out.println("endtime="+endTime);
            Duration duration = Duration.between(startTime,endTime);
            System.out.println("dduration="+duration);
            long milliSeconds = duration.toMillis();
            System.out.println("milliSeconds="+milliSeconds);
            //util.makeDir(conf,MASTER_URI,"/test1");
            //util.delete(conf,MASTER_URI,"/test1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
