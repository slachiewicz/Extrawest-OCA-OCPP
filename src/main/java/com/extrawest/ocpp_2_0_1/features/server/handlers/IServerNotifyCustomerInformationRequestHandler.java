package com.extrawest.ocpp_2_0_1.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.AuthorizeRequest;
import com.extrawest.ocpp_2_0_1.model.request.NotifyCustomerInformationRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyCustomerInformationResponse;

import java.util.UUID;

/** Central system handler of {@link AuthorizeRequest}s. */
public interface IServerNotifyCustomerInformationRequestHandler {
    NotifyCustomerInformationResponse handleNotifyCustomerInformationRequest(
            UUID sessionIndex, NotifyCustomerInformationRequest request);
}
