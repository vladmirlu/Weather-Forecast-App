class RunApp {

  import java.util.{Date, Locale}
  import java.text.DateFormat
  import java.text.DateFormat._

  object TimerAnonymous {
    def oncePerSecond(callback: () => Unit) {
      while (true) { callback(); Thread sleep 1000 }
    }
    def main(args: Array[String]) {
      oncePerSecond(() =>
        println("time flies like an arrow..."))
    }
  }
}
