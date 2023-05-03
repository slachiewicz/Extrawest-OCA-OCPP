package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.SendLocalListRequest;
import com.extrawest.ocpp_2_0_1.model.request.SetChargingProfileRequest;
import model.response.SetChargingProfileResponse;

/** Charging Station handler of {@link SendLocalListRequest} */
public interface IClientSetChargingProfileRequestHandler {
    SetChargingProfileResponse handleSetChargingProfileRequest(SetChargingProfileRequest request);
}
