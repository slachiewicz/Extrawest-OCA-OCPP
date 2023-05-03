package com.extrawest.ocpp_2_0_1.model.response;

import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.validation.RequiredValidator;
import com.extrawest.common.model.validation.Validator;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "currentTime"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class HeartbeatResponse extends Confirmation {

    private final transient Validator<Object> requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * Contains the current time of the CSMS.
     *
     * (Required)
     *
     */
    @JsonProperty("currentTime")
    public LocalDateTime currentTime;

    public HeartbeatResponse(LocalDateTime currentTime) {
        requiredValidator.validate(currentTime);
        this.currentTime = currentTime;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setCurrentTime(LocalDateTime currentTime) {
        requiredValidator.validate(currentTime);
        this.currentTime = currentTime;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(currentTime);
    }
}
