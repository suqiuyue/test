package attribute;

import policy.JsonTest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by sqy on 2018/5/14.
 */
public class createAttributeTest1 {
    public static void main(String[] args)
    {

        List cache1  = createUserAttribute();
        List cache2 = createEnvAttribute();
        List cache3 = createObjectAttribute();
        List cache4 = createServiceAttribute();


        ArrayList listContMap =  method2(cache1,cache2,cache3,cache4); //这里是属性的排列组合嘛？

        addLocationToPolicy(listContMap);
    }

    //将四类属性进行排列组合并生成策略
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
                        HashMap itemMap = initHashMap((ArrayList)L1.get(i),(ArrayList)L2.get(j),(ArrayList)L3.get(k),(ArrayList)L4.get(f));
                        Answer.add(itemMap);
                    }
                }
            }
        }
        return Answer;
    }


    public static void addLocationToPolicy(ArrayList listMap){
        int size = listMap.size();
        String[] localtionL = getLocaltion();
        HashMap<String, String> itemMap = new HashMap<String, String>();

        for (int i = 0; i < localtionL.length; i++) {
            int index = i%size;
            itemMap = (HashMap)listMap.get(index);
            itemMap.put("localtion",localtionL[i]);
            JsonTest test = new JsonTest();
            test.createpolicy(itemMap,i);

        }
    }

    public  static HashMap initHashMap(ArrayList list1,ArrayList list2,ArrayList list3,ArrayList list4)
    {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("username", (String)list1.get(0));
        map.put("genders", (String)list1.get(1));

        map.put("city", (String)list2.get(0));
        map.put("expried_time", (String)list2.get(1));

        map.put("objectType", (String)list3.get(0));
        //map.put("localtion", localtion);

        map.put("serviceType", (String)list4.get(0));
        map.put("object", (String)list4.get(1));


        return map;
    }

    public static String[] getLocaltion(){

        String[] localtion =new String[100];

        for (int honeyIndex=0;honeyIndex<2;honeyIndex++){
            for (int i = 0; i < 50; i++) {
                String honeyID = "";
                if (honeyIndex != 0){
                    honeyID = "_"+honeyIndex;
                }
                String numID = "/000";
                if (i<10) {
                    numID = "/0000";
                }
                String path = "/testdata/honey"+honeyID + numID +i;
                localtion[honeyIndex*51+i] = path;
            }
        }

        return localtion;
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

        String[] username = {"hive","root"};

        String[] genders = {"men", "women"};

        ArrayList<String[]> list = new ArrayList<>();
        list.add(username);
        list.add(genders);

        ArrayList<String> x = new ArrayList();
        permutation(list, username, x, ListEach);

        return ListEach;
    }

    //创建环境属性
    public static List<String> createEnvAttribute(){

        ArrayList<String> ListEach = new ArrayList();

        String[] city = {"chengdu", "guiyang"};
        String[] expried_time ={"2018-5-15","2018-3-16"};

        ArrayList<String[]> list = new ArrayList<>();
        list.add(city);
        list.add(expried_time);

        ArrayList<String> x = new ArrayList();
        permutation(list, city, x, ListEach);

        return ListEach;
    }

    public static List<String> createObjectAttribute(){

        ArrayList<String> ListEach = new ArrayList();

        String[] objectType = {"path"};

        ArrayList<String[]> list = new ArrayList<>();
        list.add(objectType);
       // list.add(localtion);
        ArrayList<String> x = new ArrayList();
        permutation(list, objectType, x, ListEach);

        return ListEach;
    }
    public static List<String> createServiceAttribute(){
        ArrayList<String> ListEach = new ArrayList();

        String[] serivceType = {"hadoopdev"};
        String[] object = {"path", "database"};

        ArrayList<String[]> list = new ArrayList<>();
        list.add(serivceType);
        list.add(object);
        ArrayList<String> x = new ArrayList();
        permutation(list, serivceType, x, ListEach);

        return ListEach;
    }
}
