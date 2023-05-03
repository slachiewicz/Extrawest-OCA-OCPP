package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetVariablesRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.ComponentType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.SetVariableResultType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.VariableType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.SetVariableStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.SetVariablesRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetVariablesResponse;

public class ClientSetVariablesRequestHandler implements IClientSetVariablesRequestHandler {
    @Override
    public SetVariablesResponse handleSetVariablesRequest(SetVariablesRequest request) {
        System.out.println(request.toString());
        SetVariableResultType[] setVariableResultTypes = new SetVariableResultType[2];
        setVariableResultTypes[0] = new SetVariableResultType(
                SetVariableStatusEnumType.ACCEPTED,
                new ComponentType("name"),
                new VariableType("name")
        );
        setVariableResultTypes[1] = new SetVariableResultType(
                SetVariableStatusEnumType.ACCEPTED,
                new ComponentType("name"),
                new VariableType("name"));
        return new SetVariablesResponse(setVariableResultTypes);
    }
}
