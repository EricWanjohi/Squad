import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App{
	public static void main(String[] args){
		staticFileLocation("/public");
		String layout = "templates/layout.vtl";

		// Squad Routes...
		get("/", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>(); //Creates a new HashMap object 
			model.put("template", "templates/hero.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine()); 

		get("/squad", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>(); //Creates a new HashMap object 
			model.put("template", "templates/squad.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine()); 

		post("/squads", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>(); //Creates a new HashMap object 
			model.put("template", "templates/squads.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine()); 

		post("/newHero", (request, response) -> {
			Map<String, Object> model = new HashMap<String, Object>(); // Creates a new Hashmap Object to store inputs...
			// Creates String variables to store name attribute inputs from hero.vtl
			String inputtedHeroName = request.queryParams("name");
			String inputtedHeroAge = request.queryParams("age");
			String inputtedHeroPowers = request.queryParams("powers");
			String inputtedHeroWeaknesses = request.queryParams("weaknesses");
			// Requests session to store values into our String variables from the name attribute in the hero.vtl template...
			request.session().attribute("name", inputtedHeroName);
			request.session().attribute("age", inputtedHeroAge);
			request.session().attribute("powers", inputtedHeroPowers);
			request.session().attribute("weaknesses", inputtedHeroWeaknesses);
			// Adds the data to our HashMap object named model above...
			model.put("name", inputtedHeroName);
			model.put("age", inputtedHeroAge);
			model.put("powers", inputtedHeroPowers);
			model.put("weaknesses", inputtedHeroWeaknesses);

			model.put("template", "templates/newHero.vtl");
			return new ModelAndView(model, layout);
		}, new VelocityTemplateEngine());


	}
}