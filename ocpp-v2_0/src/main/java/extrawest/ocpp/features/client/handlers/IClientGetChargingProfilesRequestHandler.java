package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetChargingProfilesRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetChargingProfilesResponse;

/** Charging Station handler of {@link GetChargingProfilesRequest} */
public interface IClientGetChargingProfilesRequestHandler {
    GetChargingProfilesResponse handleGetChargingProfilesRequest(GetChargingProfilesRequest request);
}
