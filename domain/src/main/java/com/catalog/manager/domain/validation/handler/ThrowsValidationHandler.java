package com.catalog.manager.domain.validation.handler;

import com.catalog.manager.domain.exceptions.DomainException;
import com.catalog.manager.domain.validation.Error;
import com.catalog.manager.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationHandler {

    @Override
    public ValidationHandler append(final Error anError) {
        throw DomainException.with(anError);
    }

    @Override
    public ValidationHandler append(final ValidationHandler anHandler) {
        throw DomainException.with(anHandler.getErrors());
    }

    @Override
    public ValidationHandler validate(final Validation aValidation) {
        try {
            aValidation.validate();
        } catch (final Exception ex) {
            throw DomainException.with(new Error(ex.getMessage()));
        }

        return this;
    }

    @Override
    public List<Error> getErrors() {
        return List.of();
    }
}