package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.CertificateSignedRequest;
import com.extrawest.ocpp_2_0_1.model.response.CertificateSignedResponse;

/** Charging Station handler of {@link CertificateSignedRequest} */
public interface IClientCertificateSignedRequestHandler {
    CertificateSignedResponse handleCertificateSignedRequest(CertificateSignedRequest request);
}
