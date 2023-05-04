package com.extrawest.common.model.validation;


import com.extrawest.common.PropertyConstraintException;

public class IntegerBetweenZeroAndOneHundred extends Validator<Integer> {
    private final String ERROR_MESSAGE = "Field should be 0 < = val < = 100";

    @Override
    public void validate(Integer value) throws PropertyConstraintException {
        if (value < 0 || value > 100) {
            throw new PropertyConstraintException(value, ERROR_MESSAGE);
        }
    }
}
