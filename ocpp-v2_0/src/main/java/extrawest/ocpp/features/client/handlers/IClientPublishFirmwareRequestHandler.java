package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.PublishFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.response.PublishFirmwareResponse;

/** Charging Station handler of {@link PublishFirmwareRequest} */
public interface IClientPublishFirmwareRequestHandler {
    PublishFirmwareResponse handlePublishFirmwareRequest(PublishFirmwareRequest request);
}
