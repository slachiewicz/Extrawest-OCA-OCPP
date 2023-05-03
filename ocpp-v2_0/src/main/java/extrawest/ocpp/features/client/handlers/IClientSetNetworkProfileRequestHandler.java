package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.SetNetworkProfileRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetNetworkProfileResponse;

/** Charging Station handler of {@link SetNetworkProfileRequest} */
public interface IClientSetNetworkProfileRequestHandler {
    SetNetworkProfileResponse handleSetNetworkProfileRequest(SetNetworkProfileRequest request);
}
