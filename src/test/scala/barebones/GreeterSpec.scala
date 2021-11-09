package barebones

import munit.FunSuite

class GreeterSpec extends FunSuite {

  test("Greet name") {
    assertEquals(Greeter.greet("Tom"), "Hello, Tom!")
  }
}
