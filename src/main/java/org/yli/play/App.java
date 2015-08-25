package org.yli.play;

import play.Mode;
import play.libs.F;
import play.mvc.Controller;
import play.mvc.Result;
import play.routing.RoutingDsl;
import play.server.Server;

/**
 * Created by yli on 8/24/15.
 */
public class App {
  public static void main(String[] args) {
    RoutingDsl routingDsl = new RoutingDsl().GET("/hello/").routeTo(new F.Function0<Result>() {
      public Result apply() throws Throwable {
        return Controller.ok("Hello");
      }
    });
    Server server = Server.forRouter(routingDsl.build(), Mode.PROD, 19000);
  }
}
