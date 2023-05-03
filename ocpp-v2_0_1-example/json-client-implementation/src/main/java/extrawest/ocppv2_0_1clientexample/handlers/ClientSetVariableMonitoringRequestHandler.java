package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetVariableMonitoringRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.ComponentType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.SetMonitoringResultType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.VariableType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.MonitorEnumType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.SetMonitoringStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.SetVariableMonitoringRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetVariableMonitoringResponse;

import java.util.ArrayList;
import java.util.List;

public class ClientSetVariableMonitoringRequestHandler implements IClientSetVariableMonitoringRequestHandler {
    @Override
    public SetVariableMonitoringResponse handleSetVariableMonitoringRequest(SetVariableMonitoringRequest request) {
        System.out.println(request.toString());
        List<SetMonitoringResultType> setMonitoringResultTypes = new ArrayList<>();
        setMonitoringResultTypes.add(new SetMonitoringResultType(
                SetMonitoringStatusEnumType.ACCEPTED,
                MonitorEnumType.DELTA,
                new ComponentType(),
                new VariableType(),
                1
        ));
        return new SetVariableMonitoringResponse(setMonitoringResultTypes);
    }
}
