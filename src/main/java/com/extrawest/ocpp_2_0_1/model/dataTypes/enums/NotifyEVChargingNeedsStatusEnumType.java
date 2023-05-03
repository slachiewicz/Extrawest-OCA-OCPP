package com.extrawest.ocpp_2_0_1.model.dataTypes.enums;

import com.extrawest.ocpp_2_0_1.util.EnumUtil;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Returns whether the CSMS has been able to process the message successfully. It does not imply that the evChargingNeeds can be met with the current charging profile.
 *
 *
 */
public enum NotifyEVChargingNeedsStatusEnumType {

    ACCEPTED("Accepted"),
    REJECTED("Rejected"),
    PROCESSING("Processing");
    private final String value;

    NotifyEVChargingNeedsStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static NotifyEVChargingNeedsStatusEnumType fromValue(String value) {
        return EnumUtil.findByField(
                NotifyEVChargingNeedsStatusEnumType.class,
                NotifyEVChargingNeedsStatusEnumType::value,
                value
        );
    }
}
