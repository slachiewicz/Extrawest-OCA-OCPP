package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ChangeAvailabilityRequest;
import com.extrawest.ocpp_2_0_1.model.response.ChangeAvailabilityResponse;

/** Charging Station handler of {@link ChangeAvailabilityRequest} */
public interface IClientChangeAvailabilityRequestHandler {
    ChangeAvailabilityResponse handleChangeAvailabilityRequest(ChangeAvailabilityRequest request);
}
