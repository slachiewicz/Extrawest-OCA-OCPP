package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientTriggerMessageRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.TriggerMessageStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.TriggerMessageRequest;
import com.extrawest.ocpp_2_0_1.model.response.TriggerMessageResponse;

public class ClientTriggerMessageRequestHandler implements IClientTriggerMessageRequestHandler {
    @Override
    public TriggerMessageResponse handleTriggerMessageRequest(TriggerMessageRequest request) {
        System.out.println(request.toString());
        return new TriggerMessageResponse(TriggerMessageStatusEnumType.ACCEPTED);
    }
}
