package com.extrawest.ocpp_2_0_1.model.dataTypes.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.extrawest.ocpp_2_0_1.util.EnumUtil;


/**
 * Type of monitor that triggered this event, e.g. exceeding a threshold value.
 *
 *
 *
 */
public enum EventTriggerEnumType {

    ALERTING("Alerting"),
    DELTA("Delta"),
    PERIODIC("Periodic");
    private final String value;

    EventTriggerEnumType(String value) {
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
    public static EventTriggerEnumType fromValue(String value) {
        return EnumUtil.findByField(
                EventTriggerEnumType.class,
                EventTriggerEnumType::value,
                value
        );
    }
}
