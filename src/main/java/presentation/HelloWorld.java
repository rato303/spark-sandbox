package presentation;

import static spark.Spark.before;
import static spark.Spark.get;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import presentation.filter.MyFilter;

public class HelloWorld {
	
	public static void main(String[] args) {
		final Injector injector = Guice.createInjector(new AbstractModule() {
			@Override protected void configure() {}
		});
		before(injector.getInstance(MyFilter.class));
		get("/hello", (req, res) -> new MyMessage("Hello"), new JsonTransformer());
	}

}
