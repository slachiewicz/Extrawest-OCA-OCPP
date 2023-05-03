package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetChargingProfileRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.ChargingProfileStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.SetChargingProfileRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetChargingProfileResponse;

public class ClientSetChargingProfileRequestHandler implements IClientSetChargingProfileRequestHandler {
    @Override
    public SetChargingProfileResponse handleSetChargingProfileRequest(SetChargingProfileRequest request) {
        System.out.println(request.toString());
        return new SetChargingProfileResponse(ChargingProfileStatusEnumType.ACCEPTED);
    }
}
