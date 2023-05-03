package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetDisplayMessageRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.DisplayMessageStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.SetDisplayMessageRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetDisplayMessageResponse;

public class ClientSetDisplayMessageRequestHandler implements IClientSetDisplayMessageRequestHandler {
    @Override
    public SetDisplayMessageResponse handleSetDisplayMessageRequest(SetDisplayMessageRequest request) {
        System.out.println(request.toString());
        return new SetDisplayMessageResponse(DisplayMessageStatusEnumType.ACCEPTED);
    }
}
