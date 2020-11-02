package net.atm;

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
    }
}
