package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientUpdateFirmwareRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.UpdateFirmwareStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.UpdateFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.response.UpdateFirmwareResponse;

public class ClientUpdateFirmwareRequestHandler implements IClientUpdateFirmwareRequestHandler {
    @Override
    public UpdateFirmwareResponse handleUpdateFirmwareRequest(UpdateFirmwareRequest request) {
        System.out.println(request.toString());
        return new UpdateFirmwareResponse(UpdateFirmwareStatusEnumType.ACCEPTED);
    }
}
