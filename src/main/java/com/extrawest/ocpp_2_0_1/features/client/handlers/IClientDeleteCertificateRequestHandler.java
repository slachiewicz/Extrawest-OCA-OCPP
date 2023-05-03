package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.DeleteCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.DeleteCertificateResponse;

/** Charging Station handler of {@link DeleteCertificateRequest} */
public interface IClientDeleteCertificateRequestHandler {
    DeleteCertificateResponse handleCancelDeleteCertificateRequest(DeleteCertificateRequest request);
}
