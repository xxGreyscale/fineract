/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.infrastructure.event.external.producer;

import java.util.List;
import java.util.Map;
import org.apache.fineract.infrastructure.event.external.exception.AcknowledgementTimeoutException;

public interface ExternalEventProducer {

    /**
     * Sends the created ExternalEvents
     *
     * @param partitions
     *            is a Map<Long, List<byte[]>> partitions, the key here the id of the aggregated root. The value is list
     *            of external events belong to the same key, serialized into byte array
     * @throws AcknowledgementTimeoutException
     */
    void sendEvents(Map<Long, List<byte[]>> partitions) throws AcknowledgementTimeoutException;
}
