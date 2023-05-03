package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.
        com.extrawest.ocpp_2_0_1.model.response.DeleteCertificateResponse;

/** Charging Station handler of {@link DeleteCertificateRequest} */
public interface IClientDeleteCertificateRequestHandler {
    DeleteCertificateResponse handleCancelDeleteCertificateRequest(DeleteCertificateRequest request);
}
