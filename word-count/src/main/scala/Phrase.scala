import scala.collection.mutable.Map

class Phrase(sentence: String) {
  val wordCount = sentence
    .toLowerCase
    .split("[^\\w']+") // splitting by anything but characters and apostrophes
    .foldLeft(Map[String, Int]()) {
      (m: Map[String, Int], str: String) => {
        m(str) = m.get(str).getOrElse(0) + 1 // find the string, increase its occurence (default: 0)
        m
      }
  }
}
