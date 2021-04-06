/**
 * Copyright © 2014-2021 The SiteWhere Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sitewhere.sources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import com.sitewhere.microservice.MicroserviceApplication;
import com.sitewhere.sources.spi.microservice.IEventSourcesMicroservice;

/**
 * Main application which runs the event sources microservice.
 */
public class EventSourcesApplication extends MicroserviceApplication<IEventSourcesMicroservice> {

    @Autowired
    private IEventSourcesMicroservice microservice;

    public static void main(String[] args) {
	SpringApplication.run(EventSourcesApplication.class, args);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.sitewhere.microservice.spi.IMicroserviceApplication#getMicroservice()
     */
    @Override
    public IEventSourcesMicroservice getMicroservice() {
	return microservice;
    }
}