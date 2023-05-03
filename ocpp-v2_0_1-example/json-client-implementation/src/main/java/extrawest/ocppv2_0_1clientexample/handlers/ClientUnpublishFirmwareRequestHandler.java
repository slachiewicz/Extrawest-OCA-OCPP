package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientUnpublishFirmwareRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.UnpublishFirmwareStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.UnpublishFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.response.UnpublishFirmwareResponse;

public class ClientUnpublishFirmwareRequestHandler implements IClientUnpublishFirmwareRequestHandler {
    @Override
    public UnpublishFirmwareResponse handleUnpublishFirmwareRequest(UnpublishFirmwareRequest request) {
        System.out.println(request.toString());
        return new UnpublishFirmwareResponse(UnpublishFirmwareStatusEnumType.DOWNLOAD_ONGOING);
    }
}
