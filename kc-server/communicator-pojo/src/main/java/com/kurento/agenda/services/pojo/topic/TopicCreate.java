// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.kurento.agenda.services.pojo.topic;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.kurento.agenda.datamodel.pojo.Topic;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TopicCreate implements Serializable {
	private static final long serialVersionUID = 1L;

	@XmlElement(required = true)
	private TopicBase base;

	@XmlElement(required = true)
	private Long id;

	@XmlElement(required = false)
	private String topic;

	public TopicBase getBase() {
		return base;
	}

	public void setBase(TopicBase base) {
		this.base = base;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	// //////////////////////////////////////
	// Format converters
	// //////////////////////////////////////

	public Topic buildTopicPojo() {
		return new Topic(base, id, topic);
	}
}
