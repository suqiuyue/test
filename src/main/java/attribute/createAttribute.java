package attribute;

import org.apache.avro.generic.GenericData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.IntToDoubleFunction;


public class createAttribute {

    public static void main(String[] args)
    {
        List Answer = new ArrayList();
        List totalList = new ArrayList();
        List cache1  = createUserAttribute();
//        totalList.add(cache1);
        List cache2 = createEnvAttribute();
//        totalList.add(cache2);
        List cache3 = createObjectAttribute();
//        totalList.add(cache3);
        List cache4 = createServiceAttribute();
//        totalList.add(cache4);


//        permutationForListArray(totalList,cachev,"",Answer);
        method2(cache1,cache2,cache3,cache4);
        System.out.println("success");

    }

    //最终计算方法2
    public static void method2(List L1,List L2,List L3,List L4)
    {
        Integer index = 0;
        Integer l1 = L1.size();
        Integer l2 = L2.size();
        Integer l3 = L3.size();
        Integer l4 = L4.size();
        List<String> Answer = new ArrayList();
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                for (int k = 0; k < l3; k++) {
                    for (int f = 0; f < l4; f++) {
//                        String S = L1.get(i).toString();
//                        index ++;
                        System.out.println(L1.get(i).toString()+L2.get(j).toString()+L3.get(k).toString()+L4.get(f).toString());
                    }
                }
            }
        }
//        System.out.println(index);

    }
    //最终计算方法1
//    public static void permutationForListArray(List<List> list,List arr,String str,List Target)
//    {
//        for (int i = 0;i<list.size();i++){
//
//            if (i== list.indexOf(arr)){
//                for(Object tem : arr)
//                {
//                    String s= tem.toString();
//                    s = str +" " + s;
//                    if (i < list.size() - 1)
//                    {
//                        permutationForListArray(list,list.get(i + 1), s,Target);
//                    }
//                    else if (i == list.size() - 1)
//                    {
//                        System.out.println(s);
//                        Target.add(s);
//                    }
//                }
//            }
//        }
//    }

    //递归单个排列算出模块中的排列组合
    public static void permutation(List<String[]> list, String[] arr, String str,List listTarget)
    {
        for (int i = 0; i < list.size(); i++)
        {
            //取得当前的数组
            if (i == list.indexOf(arr))
            {
                //迭代数组
                for (String st : arr)
                {
                    st = str +" " +st;
                    if (i < list.size() - 1)
                    {
                        permutation(list, list.get(i + 1), st,listTarget);
                    }
                    else if (i == list.size() - 1)
                    {
                        listTarget.add(st);
                    }
                }
            }
        }
    }

    //创建用户属性
    public static List<String> createUserAttribute(){
        ArrayList<String> ListEach = new ArrayList();
        userAttrinbute users = new userAttrinbute();
        String[] genders = {"men", "women"};
        String[] political_status = {"dangyuan", "tuanyuan", "qunzong"};
        String[] type_of_certificate = {"ID card", "school card"};
        String[] family_address = {"beijing", "shanghai", "sichuan", "hunan", "shanxi", "chongqing", "henan", "hebei"};
        String[] department = {"finance", "personnel", "technical", "sale"};
        String[] degree = {"doctor", "master", "undergraduate", "senior"};
        String[] phone_num = {"17563286325", "15984522583", "12939952458", "15632582245", "14523654587", "17589362887", "17456985254", "17596635752"};
        String[] email = {"12432546@qq.com", "13543563@qq.com", "123425325@qq.com", "27146285@qq.com", "13254376@qq.com", "21461754@qq.com", "14235312@qq.com", "13254764@qq.com"};
        String[] position = {"boss", "manager", "supervisor", "staff"};

        List<String[]> list = new ArrayList<>();
        list.add(genders);
        list.add(political_status);
        list.add(type_of_certificate);
        list.add(family_address);
        list.add(department);
        list.add(degree);
        list.add(phone_num);
        list.add(email);
        list.add(position);

        permutation(list, genders, "", ListEach);
        System.out.println(ListEach.size());

        return ListEach;
      }

      //创建环境属性
      public static List<String> createEnvAttribute(){

          ArrayList<String> ListEach = new ArrayList();
          envattribute envs = new envattribute();
          String[] city = {"chengdu", "guiyang", "changshai", "shenzhen", "taiyuan", "zhenzhou", "hainan", "xiamen"};
          String[] street = {"wangnianchang", "sansheng", "sanhe", "dongguan", "dongsheng", "dongpo", "zhonghe", "jiuliti", "shuyuanjie"};
          String[] country = {"China", "Australia", "Canada", "Germany", "Japan", "England", "America", "Thailand"};
          String[] os_type = {"windows", "linux", "mac"};
          String[] access_type = {"Command Line", "URL", "Program"};

          List<String[]> list = new ArrayList<>();
          list.add(city);
          list.add(street);
          list.add(country);
          list.add(os_type);
          list.add(access_type);
          permutation(list, city, "", ListEach);
          System.out.println(ListEach.size());
          return ListEach;
      }

      public static List<String> createObjectAttribute(){

          ArrayList<String> ListEach = new ArrayList();
          objectAttribute objects = new objectAttribute();
          String[] type = {"file", "database", "table", "column"};
          String[] create_by = {"admin", "root", "hive", "hdfs", "ranger", "knox", "yarn", "atlas"};
          String[] security_level = {"confidence", "secret", "private", "public"};
          String[] permission = {"read", "write", "execte", "read/write", "read/execte", "write/execte", "read/write/execte", "select", "delete", "update", "select/delete", "select/update", "delete/update", "all"};

          List<String[]> list = new ArrayList<>();
          list.add(type);
          list.add(create_by);
          list.add(security_level);
          list.add(permission);

          permutation(list, type, "", ListEach);
//          System.out.println(ListEach.size());
          return ListEach;
      }
      public static List<String> createServiceAttribute(){
          ArrayList<String> ListEach = new ArrayList();
          serviceattribute service = new serviceattribute();
          String[] type = {"hdfs", "hive", "yarn", "knox", "hbase", "atlas", "kafka"};
          String[] create_by = {"admin", "root", "hive", "hdfs", "ranger", "knox", "yarn", "atlas"};
          String[] object = {"file", "database", "table", "column"};

          List<String[]> list = new ArrayList<>();
          list.add(type);
          list.add(create_by);
          list.add(object);

          permutation(list, type, "", ListEach);
          System.out.println(ListEach.size());
          return ListEach;
      }
}
