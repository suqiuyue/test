package attribute;



import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class createAttribute {
    public static void main(String[] args){
        createAttribute();
    }
      public static void createAttribute(){
          userAttrinbute userAttrinbute = new userAttrinbute();


          Random random = new Random();
          int index = random.nextInt(1);
//          String gender = genders[index];

      }

      public void createUserAttribute(){

          userAttrinbute users = new userAttrinbute();
          List<String> genders = Arrays.asList("men","women");
          List<String> political_status = Arrays.asList("dangyuan","tuanyuan","qunzong");
          List<String> type_of_certificate = Arrays.asList("ID card","school card");
          List<String> family_address = Arrays.asList("beijing","shanghai","sichuan","hunan","shanxi","chongqing","henan","hebei");
          List<String> department = Arrays.asList("finance","personnel","technical","sale");
          List<String> degree = Arrays.asList("doctor","master","Undergraduate","senior");
          List<String> phone_num = Arrays.asList("17563286325","15984522583","12939952458","15632582245","14523654587","17589362887","17456985254","17596635752");
      }
}
