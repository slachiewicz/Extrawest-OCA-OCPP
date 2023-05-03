package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.SignCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.SignCertificateResponse;

import java.util.UUID;

/** Central system handler of {@link SignCertificateRequest}s. */
public interface IServerSignCertificateRequestHandler {
    SignCertificateResponse handleSignCertificateRequest(
            UUID sessionIndex, SignCertificateRequest request);
}
