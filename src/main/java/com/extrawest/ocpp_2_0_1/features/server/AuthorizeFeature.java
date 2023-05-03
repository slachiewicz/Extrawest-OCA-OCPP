package com.extrawest.ocpp_2_0_1.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerAuthorizeRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.AuthorizeRequest;
import com.extrawest.ocpp_2_0_1.model.response.AuthorizeResponse;

import java.util.UUID;

public class AuthorizeFeature implements Feature {
    private final IServerAuthorizeRequestHandler handler;

    public AuthorizeFeature(IServerAuthorizeRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleAuthorizeRequest(sessionIndex, (AuthorizeRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return AuthorizeRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return AuthorizeResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.AUTHORIZE.value();
    }
}
