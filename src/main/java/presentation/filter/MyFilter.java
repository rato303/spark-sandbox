package presentation.filter;

import com.google.inject.Inject;

import presentation.MyService;
import spark.Filter;
import spark.Request;
import spark.Response;

public class MyFilter implements Filter {
	
	private final MyService myService;
	
	@Inject
	public MyFilter(final MyService myService) {
		this.myService = myService;
	}

	@Override
	public void handle(Request request, Response response) throws Exception {
		System.out.println(request.toString());
		System.out.println(this.myService.sayHello());
	}

}
