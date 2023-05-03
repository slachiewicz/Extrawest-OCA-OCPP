package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientClearChargingProfileRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.ClearChargingProfileStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.ClearChargingProfileRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearChargingProfileResponse;

public class ClientClearChargingProfileRequestHandler implements IClientClearChargingProfileRequestHandler {
    @Override
    public ClearChargingProfileResponse handleClearChargingProfileRequest(ClearChargingProfileRequest request) {
        System.out.println(request.toString());
        return new ClearChargingProfileResponse(ClearChargingProfileStatusEnumType.ACCEPTED);
    }
}
