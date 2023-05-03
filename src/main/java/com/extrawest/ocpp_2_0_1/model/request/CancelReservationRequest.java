package com.extrawest.ocpp_2_0_1.model.request;

import com.extrawest.common.model.RequestWithId;
import com.extrawest.common.model.validation.RequiredValidator;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "reservationId"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class CancelReservationRequest extends RequestWithId {

    private transient final RequiredValidator requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * Id of the reservation to cancel.
     *
     * (Required)
     *
     */
    @JsonProperty("reservationId")
    public Integer reservationId;

    public CancelReservationRequest(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setReservationId(Integer reservationId) {
        requiredValidator.validate(reservationId);
        this.reservationId = reservationId;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(reservationId);
    }
}
