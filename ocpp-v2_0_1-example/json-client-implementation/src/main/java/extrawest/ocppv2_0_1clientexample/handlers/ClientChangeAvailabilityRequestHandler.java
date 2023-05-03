package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientChangeAvailabilityRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.ChangeAvailabilityStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.ChangeAvailabilityRequest;
import com.extrawest.ocpp_2_0_1.model.response.ChangeAvailabilityResponse;

public class ClientChangeAvailabilityRequestHandler implements IClientChangeAvailabilityRequestHandler {
    @Override
    public ChangeAvailabilityResponse handleChangeAvailabilityRequest(ChangeAvailabilityRequest request) {
        System.out.println(request.toString());
        return new ChangeAvailabilityResponse(ChangeAvailabilityStatusEnumType.ACCEPTED);
    }
}
