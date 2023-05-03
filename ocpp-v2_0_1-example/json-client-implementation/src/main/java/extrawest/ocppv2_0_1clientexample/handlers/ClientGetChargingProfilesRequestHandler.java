package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetChargingProfilesRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GetChargingProfileStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetChargingProfilesRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetChargingProfilesResponse;

public class ClientGetChargingProfilesRequestHandler implements IClientGetChargingProfilesRequestHandler {
    @Override
    public GetChargingProfilesResponse handleGetChargingProfilesRequest(GetChargingProfilesRequest request) {
        System.out.println(request.toString());
        return new GetChargingProfilesResponse(GetChargingProfileStatusEnumType.ACCEPTED);
    }
}
