package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetDisplayMessagesRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GetDisplayMessagesStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetDisplayMessagesRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetDisplayMessagesResponse;

public class ClientGetDisplayMessagesRequestHandler implements IClientGetDisplayMessagesRequestHandler {
    @Override
    public GetDisplayMessagesResponse handleGetDisplayMessagesRequest(GetDisplayMessagesRequest request) {
        System.out.println(request.toString());
        return new GetDisplayMessagesResponse(GetDisplayMessagesStatusEnumType.ACCEPTED);
    }
}
