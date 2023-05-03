package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetNetworkProfileRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.SetNetworkProfileStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.SetNetworkProfileRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetNetworkProfileResponse;

public class ClientSetNetworkProfileRequestHandler implements IClientSetNetworkProfileRequestHandler {
    @Override
    public SetNetworkProfileResponse handleSetNetworkProfileRequest(SetNetworkProfileRequest request) {
        System.out.println(request.toString());
        return new SetNetworkProfileResponse(SetNetworkProfileStatusEnumType.ACCEPTED);
    }
}
