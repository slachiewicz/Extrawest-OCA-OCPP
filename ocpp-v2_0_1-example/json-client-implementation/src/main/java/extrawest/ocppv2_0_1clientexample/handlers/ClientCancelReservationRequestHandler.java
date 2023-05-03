package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientCancelReservationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.CancelReservationStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.CancelReservationRequest;
import com.extrawest.ocpp_2_0_1.model.response.CancelReservationResponse;

public class ClientCancelReservationRequestHandler implements IClientCancelReservationRequestHandler {
    @Override
    public CancelReservationResponse handleCancelReservationRequest(CancelReservationRequest request) {
        System.out.println(request.toString());
        return new CancelReservationResponse(CancelReservationStatusEnumType.ACCEPTED);
    }
}
