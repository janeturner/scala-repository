import org.scalatest.FunSuite

class MongoTest extends FunSuite {

  test("should say Hello Mongo") {
     Mongo.helloMongo()
      assert(true)
    }



}
