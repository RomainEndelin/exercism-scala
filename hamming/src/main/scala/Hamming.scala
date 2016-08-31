
object Hamming {
  def compute(a: String, b: String): Int = {
    if (a.length() != b.length()) throw new IllegalArgumentException("Unequal length of strands")
    // for each pair of character, we increment the accumulator h if it doesn't match
    a.zip(b).foldLeft(0) {
      (h: Int, acids: (Char, Char)) => {
        if(acids._1 == acids._2) h else h + 1
      }
    }
  }
}
