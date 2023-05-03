package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetTransactionStatusRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetTransactionStatusResponse;

/** Charging Station handler of {@link GetTransactionStatusRequest} */
public interface IClientGetTransactionStatusRequestHandler {
    GetTransactionStatusResponse handleGetTransactionRequest(GetTransactionStatusRequest request);
}
