package com.catalog.manager.application.category.create;

import com.catalog.manager.application.UseCase;
import com.catalog.manager.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
