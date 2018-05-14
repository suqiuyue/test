package policy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by sqy on 2018/4/25.
 */
public class JsonTest {

    public void createpolicy(HashMap map, int num){

        RangerPolicy policy = new RangerPolicy();
        policy.setName("policy_"+num);
        policy.setIsAuditEnabled(true);
        policy.setIsEnabled(true);
        String sericeName = (String)map.get("serviceType");
        policy.setService(sericeName);
        policy.setVersion(1L);

        Map<String,RangerPolicy.RangerPolicyResource> resourceMap = new HashMap<String,RangerPolicy.RangerPolicyResource>();
        RangerPolicy.RangerPolicyResource resource = new RangerPolicy.RangerPolicyResource();

        List<String> values = new ArrayList<>();
        values.add((String)map.get("localtion"));
        resource.setValues(values);
        resource.setIsExcludes(false);
        resource.setIsRecursive(true);
        resourceMap.put((String)map.get("objectType"),resource);

        policy.setResources(resourceMap);

        List<RangerPolicy.RangerPolicyItem> rangerPolicyItemList = new ArrayList<>();
        RangerPolicy.RangerPolicyItem rangerPolicyItem = new RangerPolicy.RangerDataMaskPolicyItem();

        List<RangerPolicy.RangerPolicyItemAccess> rangerPolicyItemAccessList = new ArrayList<>();
        RangerPolicy.RangerPolicyItemAccess rangerPolicyItemAccess = new RangerPolicy.RangerPolicyItemAccess();
        rangerPolicyItemAccess.setType("read");
        rangerPolicyItemAccess.setIsAllowed(true);
        rangerPolicyItemAccessList.add(rangerPolicyItemAccess);

        rangerPolicyItem.setAccesses(rangerPolicyItemAccessList);

        /*List<RangerPolicy.RangerPolicyItemCondition> rangerPolicyItemConditionList = new ArrayList<>();
        RangerPolicy.RangerPolicyItemCondition rangerPolicyItemCondition = new RangerPolicy.RangerPolicyItemCondition();
        rangerPolicyItemCondition.setType("role");

        List<String> conditionValues = new ArrayList<>();
        conditionValues.add("teacher");

        rangerPolicyItemCondition.setValues(conditionValues);
        rangerPolicyItemConditionList.add(rangerPolicyItemCondition);

        rangerPolicyItem.setConditions(rangerPolicyItemConditionList);*/

        List<String> users = new ArrayList<>();
        users.add((String)map.get("username"));
       /* List<String> groups = new ArrayList<>();
        groups.add();*/

        rangerPolicyItem.setUsers(users);
        rangerPolicyItem.setDelegateAdmin(false);

        rangerPolicyItemList.add(rangerPolicyItem);

        policy.setPolicyItems(rangerPolicyItemList);

        OperationGson operationGson = new OperationGson();
        operationGson.saveToJson(policy);

    }
}
