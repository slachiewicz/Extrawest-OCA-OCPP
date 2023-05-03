package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerReservationStatusUpdateRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.ReservationStatusUpdateRequest;
import com.extrawest.ocpp_2_0_1.model.response.ReservationStatusUpdateResponse;

import java.util.UUID;

public class ReservationStatusUpdateFeature implements Feature {
    private final IServerReservationStatusUpdateRequestHandler handler;

    public ReservationStatusUpdateFeature(IServerReservationStatusUpdateRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleReservationStatusUpdateRequest(sessionIndex, (ReservationStatusUpdateRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return ReservationStatusUpdateRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return ReservationStatusUpdateResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.RESERVATION_STATUS_UPDATE.value();
    }
}
