package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetMonitoringLevelRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GenericStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.SetMonitoringLevelRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetMonitoringLevelResponse;

public class ClientSetMonitoringLevelRequestHandler implements IClientSetMonitoringLevelRequestHandler {
    @Override
    public SetMonitoringLevelResponse handleSetMonitoringLevelRequest(SetMonitoringLevelRequest request) {
        System.out.println(request.toString());
        return new SetMonitoringLevelResponse(GenericStatusEnumType.ACCEPTED);
    }
}
