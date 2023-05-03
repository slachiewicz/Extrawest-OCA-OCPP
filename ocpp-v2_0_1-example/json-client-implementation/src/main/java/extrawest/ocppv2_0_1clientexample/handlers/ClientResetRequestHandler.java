package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientResetRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.ResetStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.ResetRequest;
import com.extrawest.ocpp_2_0_1.model.response.ResetResponse;

public class ClientResetRequestHandler implements IClientResetRequestHandler {
    @Override
    public ResetResponse handleResetRequest(ResetRequest request) {
        System.out.println(request.toString());
        return new ResetResponse(ResetStatusEnumType.ACCEPTED);
    }
}
