package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ReservationStatusUpdateRequest;
import com.extrawest.ocpp_2_0_1.model.response.ReservationStatusUpdateResponse;

import java.util.UUID;

/** Central system handler of {@link ReservationStatusUpdateRequest}s. */
public interface IServerReservationStatusUpdateRequestHandler {
    ReservationStatusUpdateResponse handleReservationStatusUpdateRequest(
            UUID sessionIndex, ReservationStatusUpdateRequest request);
}
