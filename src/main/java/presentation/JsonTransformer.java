package presentation;

import com.google.gson.Gson;

import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

	private final static Gson GSON;
	
	static {
		GSON = new Gson();
	}
	
	@Override
	public String render(final Object model) throws Exception {
		return GSON.toJson(model);
	}

}
