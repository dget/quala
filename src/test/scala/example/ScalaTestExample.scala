package quala.example

import org.scalatest.FunSuite

class ScalaTestExample extends FunSuite {

  test("ScalaTest test") {
    assert(1 === 1)

    expect(1) {
      2 - 1
    }

    intercept[IllegalArgumentException] {
      throw new IllegalArgumentException()
    }
  }
}
