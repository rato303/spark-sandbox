package presentation;

import static spark.Spark.get;

public class HelloWorld {
	
	public static void main(String[] args) {
		get("/hello", (req, res) -> new MyMessage("Hello"), new JsonTransformer());
	}

}
