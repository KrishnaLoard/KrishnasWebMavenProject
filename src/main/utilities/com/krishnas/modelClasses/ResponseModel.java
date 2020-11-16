package com.krishnas.modelClasses;

import java.io.Serializable;

public class ResponseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 781440181898590418L;
	public String ResponseStatus;
	public Object ResponseContent;
	public String ResponseCode;

	public String getResponseStatus() {
		return ResponseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		ResponseStatus = responseStatus;
	}

	public Object getResponseContent() {
		return ResponseContent;
	}

	public void setResponseContent(Object responseContent) {
		ResponseContent = responseContent;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

}
