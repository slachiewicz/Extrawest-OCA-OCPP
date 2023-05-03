package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientReserveNowRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.ReserveNowStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.ReserveNowRequest;
import com.extrawest.ocpp_2_0_1.model.response.ReserveNowResponse;

public class ClientReserveNowRequestHandler implements IClientReserveNowRequestHandler {
    @Override
    public ReserveNowResponse handleReserveNowRequest(ReserveNowRequest request) {
        System.out.println(request.toString());
        return new ReserveNowResponse(ReserveNowStatusEnumType.ACCEPTED);
    }
}
