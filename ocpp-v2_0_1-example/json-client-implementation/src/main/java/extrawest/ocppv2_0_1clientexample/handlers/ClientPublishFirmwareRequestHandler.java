package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientPublishFirmwareRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GenericStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.PublishFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.response.PublishFirmwareResponse;

public class ClientPublishFirmwareRequestHandler implements IClientPublishFirmwareRequestHandler {
    @Override
    public PublishFirmwareResponse handlePublishFirmwareRequest(PublishFirmwareRequest request) {
        System.out.println(request.toString());
        return new PublishFirmwareResponse(GenericStatusEnumType.ACCEPTED);
    }
}
