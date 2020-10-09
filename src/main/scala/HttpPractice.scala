import java.net.{HttpURLConnection, URL, URLConnection}
import scalaj.http._

object HttpPractice {

  def helloHttp(): Int ={
    val url = new URL("https://www.google.com")
    val httpConn = url.openConnection.asInstanceOf[HttpURLConnection]
    println("Content Type using Http Connection:" + httpConn.getHeaderField("Content-Type"))
    httpConn.getResponseCode
  }

  def getHttp(): Int = {
    val response: HttpResponse[String] = Http("https://www.google.com").asString
    println("Content Type using Scala J:" + response.headers.get("Content-Type"))
    response.code
  }
}
