import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;



public class PingPong {

  public static void main(String[] args) {
    //String givenNumber = request.queryParams("number");

  //    get("/", (request, response) -> {
  //      HashMap model = new HashMap();
  //
  //      model.put("template", "templates/form.vtl");
  //      return new ModelAndView(model, "templates/layout.vtl");
  //    }, new VelocityTemplateEngine());
  // }
  //
  //     get("/form", (request, response) -> {
  //      HashMap model = new HashMap();
  //      String inputtedNumber = request.queryParams("number");
  //      Integer givenNumber = Integer.parseInt(inputtedNumber);
  //
  //      model.put("number", givenNumber);
  //      model.put("template", "templates/form.vtl");
  //      return new ModelAndView(model, "templates/layout.vtl");
  //    }, new VelocityTemplateEngine());
  }
  public ArrayList<Object> pingPong(Integer inputtedNumber) {
    ArrayList<Object> myList = new ArrayList<Object>();
     for (Integer number = 1; number <= inputtedNumber; number++) {
    //   if (number % 5 == 0 && number % 3 == 0) {
    //    myList.add("ping-pong");
    //   }
    //   else if (number % 5 == 0) {
    //    myList.add("pong");
    //   }
    //   else if (number % 3 == 0) {
    //    myList.add("ping");
    //   }
    //   else {
    //   }
      myList.add(number);
     }
    return myList;
  }


}
