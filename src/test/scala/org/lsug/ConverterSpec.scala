package org.lsug

import org.specs._
import org.specs.util.DataTables

/**
 * User: Rustem Suniev
 * Date: 19/02/2011
 * Time: 21:01
 * Email: rustem.suniev@gmail.com
 */

class ConverterSpec extends Specification with DataTables {
  "Converter should convert numbers" in {
    "from" |  "to"  |>
     1     !  "I"   |
     2     !  "II"  |
     3     !  "III" |
     4     !  "IV"  |
     5     !  "V"   |
     6     !  "VI"  |
     7     !  "VII" |
     8     !  "VIII"|
     9     !  "IX"  |
     10    !  "X"   |
     49    !  "XLIX"|
     50    !  "L"   |
     99    !  "XCIX"|
     1000  !  "M"   |
     { (from,to) => Converter.convert(from) must_==to }
  }
}