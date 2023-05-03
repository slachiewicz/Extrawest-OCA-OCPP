package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetVariablesRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.ComponentType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.GetVariableResultType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.VariableType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GetVariableStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetVariablesRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetVariablesResponse;

public class ClientGetVariablesRequestHandler implements IClientGetVariablesRequestHandler {
    @Override
    public GetVariablesResponse handleGetVariablesRequest(GetVariablesRequest request) {
        System.out.println(request.toString());
        GetVariableResultType[] getVariableResultTypes = new GetVariableResultType[2];
        GetVariableResultType getVariableResultType1 = new GetVariableResultType(
                GetVariableStatusEnumType.ACCEPTED,
                new ComponentType("name"),
                new VariableType("name"));
        getVariableResultType1.setAttributeValue("attributeValue");
        GetVariableResultType getVariableResultType2 = new GetVariableResultType(
                GetVariableStatusEnumType.ACCEPTED,
                new ComponentType("name"),
                new VariableType("name"));
        getVariableResultType2.setAttributeValue("attributeValue");
        getVariableResultTypes[0] = getVariableResultType1;
        getVariableResultTypes[1] = getVariableResultType2;
        return new GetVariablesResponse(getVariableResultTypes);
    }
}
