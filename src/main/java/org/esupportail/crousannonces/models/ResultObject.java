package org.esupportail.crousannonces.models;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ResultObject {

	@JsonProperty("result")
	private List resultList;

	public List getResultList() {
		return resultList;
	}
	
}
