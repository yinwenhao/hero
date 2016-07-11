package when_how.hero.match.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(Include.NON_NULL)
public class MyResponse {

	private static final Logger log = LoggerFactory.getLogger(MyResponse.class);
	
	public static final ObjectMapper MAPPER = new ObjectMapper();
	
	private int state;
	
	private int sss;
	
	private String content;
	
	private Object data;
	
	public MyResponse() {}
	
	public MyResponse(int state) {
		this.state = state;
	}
	
	public MyResponse(int state, String content) {
		this.state = state;
		this.content = content;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		try {
			return MAPPER.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			log.error("toString error", e);
		}
		return super.toString();
	}

	public int getSss() {
		return sss;
	}

	public void setSss(int sss) {
		this.sss = sss;
	}

}
