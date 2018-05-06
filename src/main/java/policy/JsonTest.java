package policy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import attribute.userAttrinbute;
import static policy.RangerPolicy.POLICY_TYPES;

/**
 * Created by sqy on 2018/4/25.
 */
public class JsonTest {
    public static void main(String[] args){
        RangerPolicy policy = new RangerPolicy();
        policy.setName("policy_1");
        policy.setPolicyType(0);
        policy.setIsAuditEnabled(true);
        policy.setIsEnabled(true);
        policy.setService("hdfs");
        policy.setVersion(1L);

        Map<String,RangerPolicy.RangerPolicyResource> resourceMap = new HashMap<String,RangerPolicy.RangerPolicyResource>();
        RangerPolicy.RangerPolicyResource resource = new RangerPolicy.RangerPolicyResource();

        List<String> values = new ArrayList<>();
        values.add("/test");
        resource.setValues(values);
        resource.setIsExcludes(true);
        resource.setIsRecursive(true);
        resourceMap.put("path",resource);

        policy.setResources(resourceMap);

        List<RangerPolicy.RangerPolicyItem> rangerPolicyItemList = new ArrayList<>();
        RangerPolicy.RangerPolicyItem rangerPolicyItem = new RangerPolicy.RangerDataMaskPolicyItem();

        List<RangerPolicy.RangerPolicyItemAccess> rangerPolicyItemAccessList = new ArrayList<>();
        RangerPolicy.RangerPolicyItemAccess rangerPolicyItemAccess = new RangerPolicy.RangerPolicyItemAccess();
        rangerPolicyItemAccess.setType("read");
        rangerPolicyItemAccess.setIsAllowed(true);
        rangerPolicyItemAccess.setType("write");
        rangerPolicyItemAccess.setIsAllowed(true);
        rangerPolicyItemAccessList.add(rangerPolicyItemAccess);

        rangerPolicyItem.setAccesses(rangerPolicyItemAccessList);

        List<RangerPolicy.RangerPolicyItemCondition> rangerPolicyItemConditionList = new ArrayList<>();
        RangerPolicy.RangerPolicyItemCondition rangerPolicyItemCondition = new RangerPolicy.RangerPolicyItemCondition();
        rangerPolicyItemCondition.setType("role");

        List<String> conditionValues = new ArrayList<>();
        conditionValues.add("teacher");

        rangerPolicyItemCondition.setValues(conditionValues);
        rangerPolicyItemConditionList.add(rangerPolicyItemCondition);

        rangerPolicyItem.setConditions(rangerPolicyItemConditionList);

        List<String> users = new ArrayList<>();
        users.add("test");
        List<String> groups = new ArrayList<>();
        groups.add("");

        rangerPolicyItem.setUsers(users);
        rangerPolicyItem.setDelegateAdmin(false);

        rangerPolicyItemList.add(rangerPolicyItem);

        policy.setPolicyItems(rangerPolicyItemList);

        OperationGson operationGson = new OperationGson();

        operationGson.saveToJson(policy);

        System.out.println(operationGson.loadFromJson());

    }
}
