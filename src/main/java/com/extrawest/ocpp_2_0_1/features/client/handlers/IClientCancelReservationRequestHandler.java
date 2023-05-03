package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.CancelReservationRequest;
import com.extrawest.ocpp_2_0_1.model.response.CancelReservationResponse;

/** Charging Station handler of {@link CancelReservationRequest} */
public interface IClientCancelReservationRequestHandler {
    CancelReservationResponse handleCancelReservationRequest(CancelReservationRequest request);
}
