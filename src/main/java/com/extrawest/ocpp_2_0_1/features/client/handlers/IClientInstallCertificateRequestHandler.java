package com.extrawest.ocpp_2_0_1.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.InstallCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.InstallCertificateResponse;

/** Charging Station handler of {@link InstallCertificateRequest} */
public interface IClientInstallCertificateRequestHandler {
    InstallCertificateResponse handleInstallCertificateRequest(InstallCertificateRequest request);
}
