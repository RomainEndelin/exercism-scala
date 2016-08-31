import scala.util.matching.Regex

class Bob {
  def hey(msg: String): String = {
    msg match {
      case m if silence(m) => "Fine. Be that way!"
      case m if screaming(m) => "Whoa, chill out!"
      case m if question(m) => "Sure."
      case _ => "Whatever."
    }
  }

  private def silence(msg: String): Boolean = {
    ("[^ ]".r findFirstIn msg) == None
  }

  private def screaming(msg: String): Boolean = {
    ("[a-z]".r findFirstIn msg) == None && ("[A-Z]".r findFirstIn msg) != None
  }

  private def question(msg: String): Boolean = {
    ("\\?$".r findFirstIn msg) != None
  }
}
