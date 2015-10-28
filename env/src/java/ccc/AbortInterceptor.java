package ccc;

import com.predic8.membrane.core.interceptor.*;
import com.predic8.membrane.core.http.*;
import com.predic8.membrane.core.exchange.Exchange;
import com.predic8.membrane.core.transport.http.AbortException;

public class AbortInterceptor extends AbstractInterceptor {
	private String responseContentType = null;
	private String responseContent = null;
	
	public void setResponseContentType(String type) {
		this.responseContentType = type;
	}
	
	public void setResponseContent(String content) {
		this.responseContent = content;
	}
	
	public void handleAbort(Exchange exchange) {
		exchange.setResponse(Response.badRequest()
						.header("Access-Control-Allow-Origin","*")
						.contentType(responseContentType!=null?responseContentType:"application/json")
						.body(responseContent!=null?responseContent:"{\"error\":\"Invalid request.\"}")
						.build());
	}

}