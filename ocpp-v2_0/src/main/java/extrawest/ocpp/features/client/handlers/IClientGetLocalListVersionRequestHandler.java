package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetLocalListVersionRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetLocalListVersionResponse;

/** Charging Station handler of {@link GetLocalListVersionRequest} */
public interface IClientGetLocalListVersionRequestHandler {
    GetLocalListVersionResponse handleGetLocalListVersionRequest(GetLocalListVersionRequest request);
}
