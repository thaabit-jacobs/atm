package net.atm;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;

public class Atm {
    
    public static String render(Map<String, Object> model, String hbsPath)
	{
		return new HandlebarsTemplateEngine().render(new ModelAndView(model, hbsPath));
    }
    
    public static void main(String[] args){
        staticFiles.location("/public");

        get("/", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();

            return  render(model, "index.hbs");
        }));
    }
}
