/*
 * Copyright (c) 2020-2021 Polyhedral Development
 *
 * The Terra API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the common/api directory.
 */

package com.dfsek.terra.api.block.state.properties;

import com.dfsek.terra.api.util.StringIdentifiable;

import java.util.Collection;


/**
 * Represents a property a state holds
 */
public interface Property<T> extends StringIdentifiable {
    /**
     * Get all possible values of this property
     * @return All values of this property
     */
    Collection<T> values();
    
    /**
     * Get the type of this property.
     * @return {@link Class} instance representing the type of this property
     */
    Class<T> getType();
}
