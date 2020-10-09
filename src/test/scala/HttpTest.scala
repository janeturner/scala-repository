import org.scalatest.FunSuite

class HttpTest extends FunSuite {

  test("should call http") {
    Http.helloHttp
    assert(true)
  }

}
