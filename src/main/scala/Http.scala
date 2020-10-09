import java.net.{HttpURLConnection, URL, URLConnection}

object Http {

  def helloHttp() ={
    val url = new URL("https://www.google.com")
    val httpConn = url.openConnection.asInstanceOf[HttpURLConnection]
    httpConn.getResponseCode
  }
}
