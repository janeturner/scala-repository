import org.mongodb.scala._

object Mongo {

  def helloMongo() = {
    val mongoCollection = MongoClient().getDatabase("TestDatabase").getCollection("NewCollection")

    val mongoDocument = Document("""{"key":"value"}""")

    mongoCollection.insertOne(mongoDocument).toFutureOption()
  }
}