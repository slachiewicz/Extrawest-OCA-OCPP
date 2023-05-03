package com.extrawest.ocpp_2_0_1.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientDeleteCertificateRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.DeleteCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.DeleteCertificateResponse;

import java.util.UUID;

public class DeleteCertificateFeature implements Feature {
    private final IClientDeleteCertificateRequestHandler handler;

    public DeleteCertificateFeature(IClientDeleteCertificateRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleCancelDeleteCertificateRequest((DeleteCertificateRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return DeleteCertificateRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return DeleteCertificateResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.DELETE_CERTIFICATE.value();
    }
}
