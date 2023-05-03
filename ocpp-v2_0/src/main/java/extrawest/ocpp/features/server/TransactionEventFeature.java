package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerTransactionEventRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.TransactionEventRequest;
import com.extrawest.ocpp_2_0_1.model.response.TransactionEventResponse;

import java.util.UUID;

public class TransactionEventFeature implements Feature {
    private final IServerTransactionEventRequestHandler handler;

    public TransactionEventFeature(IServerTransactionEventRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleTransactionEventRequest(sessionIndex, (TransactionEventRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return TransactionEventRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return TransactionEventResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.TRANSACTION_EVENT.value();
    }
}
