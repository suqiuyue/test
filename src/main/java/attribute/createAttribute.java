package attribute;

import org.apache.avro.generic.GenericData;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.IntToDoubleFunction;

import static java.lang.System.arraycopy;


public class createAttribute {

    public static void main(String[] args)
    {

        List cache1  = createUserAttribute();
        List cache2 = createEnvAttribute();
        List cache3 = createObjectAttribute();
        List cache4 = createServiceAttribute();

//        permutationForListArray(totalList,cachev,"",Answer);
        method2(cache1,cache2,cache3,cache4);
        System.out.println("success");

    }

    //最终计算方法2
    public static ArrayList method2(List L1,List L2,List L3,List L4)
    {
        //初始化计数器
        Integer index = 0;
        Integer l1 = L1.size();
        Integer l2 = L2.size();
        Integer l3 = L3.size();
        Integer l4 = L4.size();
        ArrayList Answer = new ArrayList();
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                for (int k = 0; k < l3; k++) {
                    for (int f = 0; f < l4; f++) {
                        ArrayList<String[]> cache = new ArrayList();

                        index ++;
                        cache.addAll((ArrayList)L1.get(i));
                        cache.addAll((ArrayList)L2.get(j));
                        cache.addAll((ArrayList)L3.get(k));
                        cache.addAll((ArrayList)L4.get(f));
                        Answer.add(cache);
                    }
                }
            }
        }
        System.out.println("总共计数是"+ index);
        return Answer;

    }
    //最终计算方法1
//    public static void permutationForListArray(ArrayList<List> list,ArrayList arr,String str,List Target)
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
    public static void permutation(ArrayList<String[]> list, String[] arr, ArrayList<String> str,ArrayList listTarget)
    {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.indexOf(arr)) {
                for (String st : arr) {
                    ArrayList<String> listx = (ArrayList<String>) str.clone();
                    listx.add(st);
                    if (i < list.size() - 1) {
                        permutation(list, list.get(i + 1), listx,listTarget);
                    }
                    else if (i == list.size() - 1) {
                        listTarget.add(listx);
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
        String[] political_status = {"dangyuan", "tuanyuan"};
        String[] type_of_certificate = {"ID card", "school card"};
        String[] family_address = {"beijing", "shanghai"};
        String[] department = {"finance", "personnel"};
        String[] degree = {"doctor", "master"};
        String[] phone_num = {"17563286325", "15984522583"};
        String[] email = {"12432546@qq.com", "13543563@qq.com"};
        String[] position = {"boss", "manager"};

        ArrayList<String[]> list = new ArrayList<>();
        list.add(genders);
        list.add(political_status);
        list.add(type_of_certificate);
        list.add(family_address);
        list.add(department);
        list.add(degree);
        list.add(phone_num);
        list.add(email);
        list.add(position);

        ArrayList<String> x = new ArrayList();
        permutation(list, genders, x, ListEach);
        System.out.println(ListEach.size());

        return ListEach;
      }

      //创建环境属性
      public static List<String> createEnvAttribute(){

          ArrayList<String> ListEach = new ArrayList();
          envattribute envs = new envattribute();
          String[] city = {"chengdu", "guiyang"};
          String[] street = {"wangnianchang", "sansheng"};
          String[] country = {"China", "Australia"};
          String[] os_type = {"windows", "linux"};
          String[] access_type = {"Command Line", "URL"};

          ArrayList<String[]> list = new ArrayList<>();
          list.add(city);
          list.add(street);
          list.add(country);
          list.add(os_type);
          list.add(access_type);
          ArrayList<String> x = new ArrayList();
          permutation(list, city, x, ListEach);
          System.out.println(ListEach.size());
          return ListEach;
      }

      public static List<String> createObjectAttribute(){

          ArrayList<String> ListEach = new ArrayList();
          objectAttribute objects = new objectAttribute();
          String[] type = {"file", "database"};
          String[] create_by = {"admin", "root"};
          String[] security_level = {"confidence", "secret"};
          String[] permission = {"read", "write", "execte"};

          ArrayList<String[]> list = new ArrayList<>();
          list.add(type);
          list.add(create_by);
          list.add(security_level);
          list.add(permission);
          ArrayList<String> x = new ArrayList();
          permutation(list, type, x, ListEach);
//          System.out.println(ListEach.size());
          return ListEach;
      }
      public static List<String> createServiceAttribute(){
          ArrayList<String> ListEach = new ArrayList();
          serviceattribute service = new serviceattribute();
          String[] type = {"hdfs", "hive"};
          String[] create_by = {"admin", "root"};
          String[] object = {"file", "database"};

          ArrayList<String[]> list = new ArrayList<>();
          list.add(type);
          list.add(create_by);
          list.add(object);
          ArrayList<String> x = new ArrayList();
          permutation(list, type, x, ListEach);
          System.out.println(ListEach.size());
          return ListEach;
      }
}
