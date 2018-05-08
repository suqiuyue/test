package attribute;

import java.util.Arrays;
import java.util.List;


public class createAttribute {

      public void createJson(){

      }


      public userAttrinbute createUserAttribute(){

          userAttrinbute users = new userAttrinbute();
          String[] genders = {"men","women"};
          String[] political_status = {"dangyuan","tuanyuan","qunzong"};
          String[] type_of_certificate = {"ID card","school card"};
          String[] family_address = {"beijing","shanghai","sichuan","hunan","shanxi","chongqing","henan","hebei"};
          String[] department = {"finance","personnel","technical","sale"};
          String[] degree = {"doctor","master","undergraduate","senior"};
          String[] phone_num = {"17563286325","15984522583","12939952458","15632582245","14523654587","17589362887","17456985254","17596635752"};
          String[] email = {"12432546@qq.com","13543563@qq.com","123425325@qq.com","27146285@qq.com","13254376@qq.com","21461754@qq.com","14235312@qq.com","13254764@qq.com"};
          String[] position = {"boss","manager","supervisor","staff"};



          return users;
      }

      public envattribute createEnvAttribute(){

        envattribute envs = new envattribute();
        String[] city = {"chengdu","guiyang","changshai","shenzhen","taiyuan","zhenzhou","hainan","xiamen"};
        String[] street = {"wangnianchang","sansheng","sanhe","dongguan","dongsheng","dongpo","zhonghe","jiuliti","shuyuanjie"};
        String[] country = {"China","Australia","Canada","Germany","Japan","England","America","Thailand"};
        String[] os_type = {"windows","linux","mac"};
        String[] access_type = {"Command Line","URL","Program"};

        return envs;
      }

      public objectAttribute createObjectAttribute(){
        objectAttribute objects = new objectAttribute();
        String[] type = {"file","database","table","column"};
        String[] create_by = {"admin","root","hive","hdfs","ranger","knox","yarn","atlas"};
        String[] security_level = {"confidence","secret","private","public"};
        String[] permission = {"read","write","execte","read/write","read/execte","write/execte","read/write/execte","select","delete","update","select/delete","select/update","delete/update","all"};


        return objects;
      }
      public serviceattribute createServiceAttribute(){
        serviceattribute service = new serviceattribute();
        String[] type = {"hdfs","hive","yarn","knox","hbase","atlas","kafka"};
        String[] create_by = {"admin","root","hive","hdfs","ranger","knox","yarn","atlas"};
        String[] object = {"file","database","table","column"};

        return service;
      }
}
