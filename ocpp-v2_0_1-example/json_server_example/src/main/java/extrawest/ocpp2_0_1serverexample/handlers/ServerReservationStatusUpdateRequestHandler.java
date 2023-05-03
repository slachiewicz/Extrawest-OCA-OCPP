package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerReservationStatusUpdateRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.ReservationStatusUpdateRequest;
import com.extrawest.ocpp_2_0_1.model.response.ReservationStatusUpdateResponse;

import java.util.UUID;

public class ServerReservationStatusUpdateRequestHandler implements IServerReservationStatusUpdateRequestHandler {
    @Override
    public ReservationStatusUpdateResponse handleReservationStatusUpdateRequest(UUID sessionIndex, ReservationStatusUpdateRequest request) {
        return new ReservationStatusUpdateResponse();
    }
}
