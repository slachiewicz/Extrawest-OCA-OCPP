package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetLogRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.LogStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetLogRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetLogResponse;

public class ClientGetLogRequestHandler implements IClientGetLogRequestHandler {
    @Override
    public GetLogResponse handleGetLogRequest(GetLogRequest request) {
        System.out.println(request.toString());
        return new GetLogResponse(LogStatusEnumType.ACCEPTED);
    }
}
