package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ClearChargingProfileRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearChargingProfileResponse;

/** Charging Station handler of {@link ClearChargingProfileRequest} */
public interface IClientClearChargingProfileRequestHandler {
    ClearChargingProfileResponse handleClearChargingProfileRequest(ClearChargingProfileRequest request);
}
