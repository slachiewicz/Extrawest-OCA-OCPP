package com.extrawest.common.model.validation;


import com.extrawest.common.PropertyConstraintException;

public class IntegerBetweenZeroAndNine extends Validator<Integer> {
    private final String ERROR_MESSAGE = "Field should be from 0 to 9";

    @Override
    public void validate(Integer value) throws PropertyConstraintException {
        if (value < 0 || value > 9) {
            throw new PropertyConstraintException(value, ERROR_MESSAGE);
        }
    }
}
