package com.catalog.manager.application.category.create;

import com.catalog.manager.domain.category.Category;
import com.catalog.manager.domain.category.CategoryID;

public record CreateCategoryOutput(
        CategoryID id
) {

    public static CreateCategoryOutput from(final Category aCategory) {
        return new CreateCategoryOutput(aCategory.getId());
    }
}