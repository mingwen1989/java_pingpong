import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class PingPong {

  public static void main(String[] args) {
    // String givenNumber = request.queryParams("number");
  }

  public ArrayList<Object> pingPong(Integer inputtedNumber) {
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
      }
      myList.add(number);
    }
    return myList;
  }


}
