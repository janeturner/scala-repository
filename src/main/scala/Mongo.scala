import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Projections._
import org.mongodb.scala.model.Sorts._


object Mongo {

  val mongoCollection = MongoClient().getDatabase("TestDatabase").getCollection("NewCollection")

  def writeMongo() = {

    val mongoDocument = Document("""{"key":"value"}""")
    mongoCollection.insertOne(mongoDocument).toFutureOption()
  }

  def readMongo() = {
    val list = mongoCollection.find()
    println(list)
  }
}