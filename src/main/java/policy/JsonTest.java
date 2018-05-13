package policy;

import attribute.createAttribute;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import attribute.userAttrinbute;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

import javax.ws.rs.core.MediaType;

import static policy.RangerPolicy.POLICY_TYPES;

/**
 * Created by sqy on 2018/4/25.
 */
public class JsonTest {

    public void createpolicy(ArrayList list, int num){

        RangerPolicy policy = new RangerPolicy();
        policy.setName("policy_"+num);
        policy.setPolicyType(0);
        policy.setIsAuditEnabled(true);
        policy.setIsEnabled(true);
        policy.setService(list.get(19).toString());
        policy.setVersion(1L);

        Map<String,RangerPolicy.RangerPolicyResource> resourceMap = new HashMap<String,RangerPolicy.RangerPolicyResource>();
        RangerPolicy.RangerPolicyResource resource = new RangerPolicy.RangerPolicyResource();

        List<String> values = new ArrayList<>();
        values.add(list.get(18).toString());
        resource.setValues(values);
        resource.setIsExcludes(true);
        resource.setIsRecursive(true);
        resourceMap.put(list.get(21).toString(),resource);

        policy.setResources(resourceMap);

        List<RangerPolicy.RangerPolicyItem> rangerPolicyItemList = new ArrayList<>();
        RangerPolicy.RangerPolicyItem rangerPolicyItem = new RangerPolicy.RangerDataMaskPolicyItem();

        List<RangerPolicy.RangerPolicyItemAccess> rangerPolicyItemAccessList = new ArrayList<>();
        RangerPolicy.RangerPolicyItemAccess rangerPolicyItemAccess = new RangerPolicy.RangerPolicyItemAccess();
        rangerPolicyItemAccess.setType(list.get(17).toString());
        rangerPolicyItemAccess.setIsAllowed(true);
        /*rangerPolicyItemAccess.setType("write");
        rangerPolicyItemAccess.setIsAllowed(true);*/
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
        users.add(list.get(8).toString());
        List<String> groups = new ArrayList<>();
        groups.add(list.get(5).toString());

        rangerPolicyItem.setUsers(users);
        rangerPolicyItem.setDelegateAdmin(false);

        rangerPolicyItemList.add(rangerPolicyItem);

        policy.setPolicyItems(rangerPolicyItemList);

       // System.out.println(policy);
        OperationGson operationGson = new OperationGson();
        operationGson.saveToJson(policy);

        //return result;
        //System.out.println(operationGson.loadFromJson());
    }
}
