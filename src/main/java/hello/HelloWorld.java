package hello;

import org.joda.time.LocalTime;

class HelloWorld {
  public static void main(String[] args) {
  	LocalTime currentTime = new LocalTime();
  	System.out.println("The current local time is: " + currentTime);

    Greeter g = new Greeter();
    System.out.println(g.sayHello());
  }
}
