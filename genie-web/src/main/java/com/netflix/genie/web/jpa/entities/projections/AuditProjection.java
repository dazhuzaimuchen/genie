/*
 *
 *  Copyright 2017 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.genie.web.jpa.entities.projections;

import java.util.Date;

/**
 * Returns all the base entity attributes.
 *
 * @author tgianos
 * @since 3.3.0
 */
public interface AuditProjection extends IdProjection {

    /**
     * Get when this entity was created.
     *
     * @return The created timestamp
     */
    Date getCreated();

    /**
     * Get when this entity was updated.
     *
     * @return The updated timestamp
     */
    Date getUpdated();
}
