package attribute;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.apache.avro.generic.GenericData;
import policy.JsonTest;

import javax.ws.rs.core.MediaType;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
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
       ArrayList x =  method2(cache1,cache2,cache3,cache4);

        //例子，比如现在取第3000个策略 的性别
       /* ArrayList person = (ArrayList)x.get(3000);
        System.out.println("当前性别是"+person.get(0));
        System.out.println("success");*/
    }




    //最终计算方法2

    public static ArrayList method2(List L1,List L2,List L3,List L4)
    {
        //初始化计数器
        Integer index = 0;
        Integer l1 = L1.size();//userAttrinbute={{men,dangyuan,ID card,beijing},{}..{}}
        Integer l2 = L2.size();//envattribute={}
        Integer l3 = L3.size();//
        Integer l4 = L4.size();
        ArrayList Answer = new ArrayList();
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                for (int k = 0; k < l3; k++) {
                    for (int f = 0; f < l4; f++) {
                        ArrayList<String[]> cache = new ArrayList();

                        index ++;








                        HashMap itemMap = initHashMap((ArrayList)L1.get(i),(ArrayList)L2.get(j),(ArrayList)L3.get(k),(ArrayList)L4.get(f));

//                        cache.addAll((ArrayList)L1.get(i));
//                        cache.addAll((ArrayList)L2.get(j));
//                        cache.addAll((ArrayList)L3.get(k));
//                        cache.addAll((ArrayList)L4.get(f));
                        Answer.add(itemMap);

                        JsonTest test = new JsonTest();
                        test.createpolicy(itemMap,index);

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

    public  static HashMap initHashMap(ArrayList list1,ArrayList list2,ArrayList list3,ArrayList list4)
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("genders", (String)list1.get(0));
        map.put("political_status", (String)list1.get(1));
        map.put("type_of_certificate", (String)list1.get(2));
        map.put("family_address", (String)list1.get(3));
        map.put("department", (String)list1.get(4));
        map.put("degree", (String)list1.get(5));
        map.put("phone_num", (String)list1.get(6));
        map.put("email", (String)list1.get(7));
        map.put("position", (String)list1.get(8));

        map.put("city", (String)list2.get(0));
        map.put("street", (String)list2.get(1));
        map.put("country", (String)list2.get(2));
        map.put("os_type", (String)list2.get(3));
        map.put("access_type", (String)list2.get(4));

        map.put("objType", (String)list3.get(0));
        map.put("objCreate_by", (String)list3.get(1));
        map.put("security_level", (String)list3.get(2));
        map.put("permission", (String)list3.get(3));
        map.put("localtion", (String)list3.get(4));

        map.put("serType", (String)list4.get(0));
        map.put("serCreate_by", (String)list4.get(1));
        map.put("object", (String)list4.get(2));


        return map;
    }
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
//        System.out.println(ListEach.size());

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
//          System.out.println(ListEach.size());
          return ListEach;
      }

      public static List<String> createObjectAttribute(){

          ArrayList<String> ListEach = new ArrayList();
          objectAttribute objects = new objectAttribute();
          String[] type = {"path", "database"};
          String[] create_by = {"admin", "root"};
          String[] security_level = {"confidence", "secret"};
          String[] permission = {"read", "write", "execte"};
          String[] localtion = {"/testdata/systemlog","/testdata/test"};

          ArrayList<String[]> list = new ArrayList<>();
          list.add(type);
          list.add(create_by);
          list.add(security_level);
          list.add(permission);
          list.add(localtion);
          ArrayList<String> x = new ArrayList();
          permutation(list, type, x, ListEach);
//          System.out.println(ListEach.size());
          return ListEach;
      }
      public static List<String> createServiceAttribute(){
          ArrayList<String> ListEach = new ArrayList();
          serviceattribute service = new serviceattribute();
          String[] type = {"hadoopdev", "hivedev"};
          String[] create_by = {"admin", "root"};
          String[] object = {"file", "database"};

          ArrayList<String[]> list = new ArrayList<>();
          list.add(type);
          list.add(create_by);
          list.add(object);
          ArrayList<String> x = new ArrayList();
          permutation(list, type, x, ListEach);
//          System.out.println(ListEach.size());
          return ListEach;
      }
}
