package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetCompositeScheduleRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GenericStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetCompositeScheduleRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetCompositeScheduleResponse;

public class ClientGetCompositeScheduleRequestHandler implements IClientGetCompositeScheduleRequestHandler {
    @Override
    public GetCompositeScheduleResponse handleGetCompositeScheduleRequest(GetCompositeScheduleRequest request) {
        System.out.println(request.toString());
        return new GetCompositeScheduleResponse(GenericStatusEnumType.ACCEPTED);
    }
}
