import scala.collection.mutable.Map

class Phrase(sentence: String) {
  val wordCount = sentence
    .map((c: Char) => c.toLower)
    .replaceAll("""[\p{Punct}&&[^,']]""", "") // removing all punctuation except comma and apostrophe
    .split("[\\s,]+") // splitting by multiple whitespace, or by comma
    .foldLeft(Map[String, Int]()) {
      (m: Map[String, Int], str: String) => {
        m(str) = m.get(str).getOrElse(0) + 1 // find the string, increase its occurence (default: 0)
        m
      }
  }
}
