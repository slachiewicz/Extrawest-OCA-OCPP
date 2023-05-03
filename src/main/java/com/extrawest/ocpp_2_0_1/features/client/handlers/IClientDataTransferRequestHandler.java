package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.DataTransferRequest;
import com.extrawest.ocpp_2_0_1.model.response.DataTransferResponse;

/** Charging Station handler of {@link DataTransferRequest} */
public interface IClientDataTransferRequestHandler {
    DataTransferResponse handleCancelDataTransferRequest(DataTransferRequest request);
}
