package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.UnpublishFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.response.UnpublishFirmwareResponse;

/** Charging Station handler of {@link UnpublishFirmwareRequest} */
public interface IClientUnpublishFirmwareRequestHandler {
    UnpublishFirmwareResponse handleUnpublishFirmwareRequest(UnpublishFirmwareRequest request);
}
