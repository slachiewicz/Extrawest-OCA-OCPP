package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.UnpublishFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.request.UpdateFirmwareRequest;
import com.extrawest.ocpp_2_0_1.model.response.UpdateFirmwareResponse;

/** Charging Station handler of {@link UnpublishFirmwareRequest} */
public interface IClientUpdateFirmwareRequestHandler {
    UpdateFirmwareResponse handleUpdateFirmwareRequest(UpdateFirmwareRequest request);
}
