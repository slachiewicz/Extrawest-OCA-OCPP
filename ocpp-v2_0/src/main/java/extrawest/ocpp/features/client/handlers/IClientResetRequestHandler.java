package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ResetRequest;
import com.extrawest.ocpp_2_0_1.model.response.ResetResponse;

/** Charging Station handler of {@link ResetRequest} */
public interface IClientResetRequestHandler {
    ResetResponse handleResetRequest(ResetRequest request);
}
