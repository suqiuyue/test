package connecthdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.time.LocalDateTime;

/**
 * Created by sqy on 2018/4/8.
 */
public class HdfsUtil {

    public  void ls(Configuration conf, String uri, String folder) throws IOException {
        Path path = new Path(folder);
        FileSystem fs = FileSystem.get(URI.create(uri),conf);
        FileStatus[] list = fs.listStatus(path);
        System.out.println("ls: " + folder);
        for (FileStatus f : list) {
            //System.out.printf("name: %s, folder: %s, size: %d\n", f.getPath(), f.isDirectory(), f.getLen());
            f.getPath();
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("endtime="+endTime);
        System.out.println("==========================================================");
        fs.close();
    }

    public  void makeDir(Configuration conf, String uri, String remoteFile) throws IOException {
        FileSystem fs = FileSystem.get(URI.create(uri), conf);
        Path path = new Path(remoteFile);

        fs.mkdirs(path);
        System.out.println("create folder:" + remoteFile);
        System.out.println("==========================================================");
    }

    public void delete(Configuration conf,String uri,String targetFile) throws IOException{
        FileSystem fs = FileSystem.get(URI.create(uri),conf);
        Path path = new Path(targetFile);
        fs.delete(path,true);
        fs.close();
        System.out.println("delete:"+targetFile);
        System.out.println("==========================================================");
    }

    public  void copyFromLocal(Configuration conf,String uri,String src,String dst) throws Exception{
        FileSystem fs = FileSystem.get(URI.create(uri),conf);
        Path pathDst = new Path(dst);
        Path pathSrc = new Path(src);
        fs.copyFromLocalFile(pathSrc,pathDst);
        fs.close();
        System.out.println("copyFromLocal() is done");
        System.out.println("==========================================================");
    }


    public  void copyToLocal(Configuration conf,String uri,String src,String dst) throws Exception{
        FileSystem fs = FileSystem.get(URI.create(uri),conf);
        Path pathDst = new Path(dst);
        Path pathSrc = new Path(src);
        fs.copyToLocalFile(pathSrc,pathDst);
        fs.close();
        System.out.println("copyToLocal() is done!");
        System.out.println("==========================================================");
    }
}
