package attribute;

import java.util.Arrays;
import java.util.List;


public class createAttribute {

      public userAttrinbute createUserAttribute(){

          userAttrinbute users = new userAttrinbute();
          List<String> genders = Arrays.asList("men","women");
          List<String> political_status = Arrays.asList("dangyuan","tuanyuan","qunzong");
          List<String> type_of_certificate = Arrays.asList("ID card","school card");
          List<String> family_address = Arrays.asList("beijing","shanghai","sichuan","hunan","shanxi","chongqing","henan","hebei");
          List<String> department = Arrays.asList("finance","personnel","technical","sale");
          List<String> degree = Arrays.asList("doctor","master","Undergraduate","senior");
          List<String> phone_num = Arrays.asList("17563286325","15984522583","12939952458","15632582245","14523654587","17589362887","17456985254","17596635752");
          List<String> email = Arrays.asList("12432546@qq.com","13543563@qq.com","123425325@qq.com","27146285@qq.com","13254376@qq.com","21461754@qq.com","14235312@qq.com","13254764@qq.com");
          List<String> position = Arrays.asList("boss","manager","supervisor","staff");

          users.setGender(genders);
          users.setPolitical_status(political_status);
          users.setType_of_certificate(type_of_certificate);
          users.setFamily_address(family_address);
          users.setDepartment(department);
          users.setDegree(degree);
          users.setPhone_num(phone_num);
          users.setEmail(email);
          users.setPosition(position);
          return users;
      }

      public envattribute createEnvAttribute(){

        envattribute envs = new envattribute();
        List<String> city = Arrays.asList("chengdu","guiyang","changshai","shenzhen","taiyuan","zhenzhou","hainan","xiamen");
        List<String> street = Arrays.asList("wangnianchang","sansheng","sanhe","dongguan","dongsheng","dongpo","zhonghe","jiuliti","shuyuanjie");
        List<String> country = Arrays.asList("China","Australia","Canada","Germany","Japan","England","America","Thailand");
        List<String> os_type = Arrays.asList("windows","linux","mac");
        List<String> access_type = Arrays.asList("Command Line","URL","Program");

        envs.setCity(city);
        envs.setStreet(street);
        envs.setCountry(country);
        envs.setAccess_type(access_type);
        envs.setOs_type(os_type);

        return envs;
      }

      public objectAttribute createObjectAttribute(){
        objectAttribute objects = new objectAttribute();
        List<String> type = Arrays.asList("file","database","table","column");
        List<String> create_by = Arrays.asList("admin","root","hive","hdfs","ranger","knox","yarn","atlas");
        List<String> security_level = Arrays.asList("confidence","secret","private","public");
        List<String> permission = Arrays.asList("read","write","execte","read/write","read/execte","write/execte","read/write/execte","select","delete","update","select/delete","select/update","delete/update","all");

        objects.setType(type);
        objects.setCreate_by(create_by);
        objects.setSecurity_level(security_level);
        objects.setPermission(permission);

        return objects;
      }
      public serviceattribute createServiceAttribute(){
        serviceattribute service = new serviceattribute();
        List<String> type = Arrays.asList("hdfs","hive","yarn","knox","hbase","atlas","kafka");
        List<String> create_by = Arrays.asList("admin","root","hive","hdfs","ranger","knox","yarn","atlas");
        List<String> object = Arrays.asList("file","database","table","column");

        service.setType(type);
        service.setCreate_by(create_by);
        service.setObject(object);

        return service;
      }
}
