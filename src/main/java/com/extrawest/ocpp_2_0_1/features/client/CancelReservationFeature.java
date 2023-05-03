package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.common.feature.Feature;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientCancelReservationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.CancelReservationRequest;
import com.extrawest.ocpp_2_0_1.model.response.CancelReservationResponse;

import java.util.UUID;

public class CancelReservationFeature implements Feature {
    private final IClientCancelReservationRequestHandler handler;

    public CancelReservationFeature(IClientCancelReservationRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleCancelReservationRequest((CancelReservationRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return CancelReservationRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return CancelReservationResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.CANCEL_RESERVATION.value();
    }
}
