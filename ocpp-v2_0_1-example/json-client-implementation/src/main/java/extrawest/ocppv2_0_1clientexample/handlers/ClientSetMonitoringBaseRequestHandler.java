package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetMonitoringBaseRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GenericDeviceModelStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.SetMonitoringBaseRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetMonitoringBaseResponse;

public class ClientSetMonitoringBaseRequestHandler implements IClientSetMonitoringBaseRequestHandler {
    @Override
    public SetMonitoringBaseResponse handleSetMonitoringBaseRequest(SetMonitoringBaseRequest request) {
        System.out.println(request.toString());
        return new SetMonitoringBaseResponse(GenericDeviceModelStatusEnumType.ACCEPTED);
    }
}
