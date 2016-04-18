import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;



public class PingPong {

  public static void main(String[] args) {
     String layout = "templates/layout.vtl";

     get("/", (request, response) -> {
       Map<String, Object> model = new HashMap<String, Object>();

       model.put("template", "templates/form.vtl");
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

      get("/results", (request, response) -> {
       Map<String, Object> model = new HashMap<String, Object>();
       model.put("template", "templates/results.vtl");

       String inputtedNumber = request.queryParams("number");
       Integer countUpTo = Integer.parseInt(inputtedNumber);
      //  PingPong myPingPong = new PingPong();
       ArrayList<Object> pingPong = pingPong(countUpTo);

       model.put("pingPong", pingPong);
       model.put("inputtedNumber", inputtedNumber);
       model.put("number", request.queryParams("number"));
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());



   }

  public static ArrayList<Object> pingPong(Integer inputtedNumber) {
    ArrayList<Object> myList = new ArrayList<Object>();
    for (Integer number = 1; number <= inputtedNumber; number++) {
      if (number % 5 == 0 && number % 3 == 0) {
       myList.add("ping-pong");
      }
      else if (number % 5 == 0) {
       myList.add("pong");
      }
      else if (number % 3 == 0) {
       myList.add("ping");
      }
      else {
      myList.add(number);
      }

    }
    return myList;
  }


}
