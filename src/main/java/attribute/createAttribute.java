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
          List<String> genders = Arrays.asList("men","women");

          Random random = new Random();
          int index = random.nextInt(1);
//          String gender = genders[index];
          userAttrinbute.setGender("hufan");
      }
}
