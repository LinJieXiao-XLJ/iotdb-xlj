/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.iotdb.commons.pipe.agent.task.connection;

import org.apache.iotdb.pipe.api.event.Event;

@FunctionalInterface
public interface EventSupplier {

  /**
   * @return the event to be supplied. the event may be null if the extractor has no more events at
   *     the moment, but the extractor is still running for more events.
   * @throws Exception if the supplier fails to supply the event.
   */
  @SuppressWarnings("squid:S00112") // Exception is thrown by the interface
  Event supply() throws Exception;
}