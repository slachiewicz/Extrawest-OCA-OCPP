package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.TransactionEventRequest;
import com.extrawest.ocpp_2_0_1.model.response.TransactionEventResponse;

import java.util.UUID;

/** Central system handler of {@link TransactionEventRequest}s. */
public interface IServerTransactionEventRequestHandler {
    TransactionEventResponse handleTransactionEventRequest(
            UUID sessionIndex, TransactionEventRequest request);
}
