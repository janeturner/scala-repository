import org.scalatest.FunSuite

class HttpPracticeTest extends FunSuite {

  test("should call http") {
    assert(HttpPractice.helloHttp == 200)
  }

  test("should call http GET") {
    assert(HttpPractice.getHttp == 200)
  }

}
