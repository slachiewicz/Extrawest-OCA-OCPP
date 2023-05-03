package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientClearDisplayMessageRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.ClearMessageStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.ClearDisplayMessageRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearDisplayMessageResponse;

public class ClientClearDisplayMessageRequestHandler implements IClientClearDisplayMessageRequestHandler {
    @Override
    public ClearDisplayMessageResponse handleClearDisplayMessageRequest(ClearDisplayMessageRequest request) {
        System.out.println(request.toString());
        return new ClearDisplayMessageResponse(ClearMessageStatusEnumType.ACCEPTED);
    }
}
