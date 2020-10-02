import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Projections._
import org.mongodb.scala.model.Sorts._
import org.mongodb.scala.model.Updates._


object Mongo {

  val mongoCollection = MongoClient().getDatabase("TestDatabase").getCollection("NewCollection")

  def writeMongo(key: String, value: String) = {

    val mongoDocument = Document(s"""{"$key":"$value"}""")
    mongoCollection.insertOne(mongoDocument).toFutureOption()
  }

  def readMongo() = {
    mongoCollection.find
  }

  def deleteMongo(key: String, value: String) = {
    mongoCollection.deleteOne(equal(key, value)).toFutureOption()
  }

  def updateMongo(key: String, newKey: String, value: String, newValue: String) = {
    mongoCollection.updateOne(equal(key, value), set(newKey, newValue)).toFutureOption()
  }
}