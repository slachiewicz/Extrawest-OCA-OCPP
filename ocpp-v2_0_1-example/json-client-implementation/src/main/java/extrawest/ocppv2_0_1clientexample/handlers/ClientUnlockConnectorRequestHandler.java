package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientUnlockConnectorRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.UnlockStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.UnlockConnectorRequest;
import com.extrawest.ocpp_2_0_1.model.response.UnlockConnectorResponse;

public class ClientUnlockConnectorRequestHandler implements IClientUnlockConnectorRequestHandler {
    @Override
    public UnlockConnectorResponse handleUnlockConnectorRequest(UnlockConnectorRequest request) {
        System.out.println(request.toString());
        return new UnlockConnectorResponse(UnlockStatusEnumType.UNLOCKED);
    }
}
