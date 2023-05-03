package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSendLocalListRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.SendLocalListStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.SendLocalListRequest;
import com.extrawest.ocpp_2_0_1.model.response.SendLocalListResponse;

public class ClientSendLocalListRequestHandler implements IClientSendLocalListRequestHandler {
    @Override
    public SendLocalListResponse handleSendLocalListRequest(SendLocalListRequest request) {
        System.out.println(request.toString());
        return new SendLocalListResponse(SendLocalListStatusEnumType.ACCEPTED);
    }
}
