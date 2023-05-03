package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ReserveNowRequest;
import com.extrawest.ocpp_2_0_1.model.response.ReserveNowResponse;

/** Charging Station handler of {@link ReserveNowRequest} */
public interface IClientReserveNowRequestHandler {
    ReserveNowResponse handleReserveNowRequest(ReserveNowRequest request);
}
