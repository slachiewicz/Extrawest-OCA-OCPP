package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerTransactionEventRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.TransactionEventRequest;
import com.extrawest.ocpp_2_0_1.model.response.TransactionEventResponse;

import java.util.UUID;

public class ServerTransactionEventRequestHandler implements IServerTransactionEventRequestHandler {
    @Override
    public TransactionEventResponse handleTransactionEventRequest(UUID sessionIndex, TransactionEventRequest request) {
        return new TransactionEventResponse();
    }
}
