package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientClearVariableMonitoringRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.ClearMonitoringResultType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.ClearMonitoringStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.ClearVariableMonitoringRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearVariableMonitoringResponse;

import java.util.ArrayList;
import java.util.List;

public class ClientClearVariableMonitoringRequestHandler implements IClientClearVariableMonitoringRequestHandler {
    @Override
    public ClearVariableMonitoringResponse handleClearVariableMonitoringRequest(ClearVariableMonitoringRequest request) {
        System.out.println(request.toString());
        List<ClearMonitoringResultType> clearMonitoringResultTypes = new ArrayList<>();
        clearMonitoringResultTypes.add(new ClearMonitoringResultType(ClearMonitoringStatusEnumType.ACCEPTED, 1));
        return new ClearVariableMonitoringResponse(clearMonitoringResultTypes);
    }
}
