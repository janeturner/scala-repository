import org.scalatest.FunSuite

class MongoTest extends FunSuite {

  test("should say Hello Mongo") {
     Mongo.writeMongo()
      assert(true)
    }

  test("should find all data in coleection") {
    Mongo.readMongo()
    assert(true)
  }


}
