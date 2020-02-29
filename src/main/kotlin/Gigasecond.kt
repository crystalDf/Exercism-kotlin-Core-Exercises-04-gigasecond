import java.time.LocalDate
import java.time.LocalDateTime

const val GIGA_SECOND: Long = 1e9.toLong()

class Gigasecond(givenDateTime: LocalDateTime) {

    val date: LocalDateTime = givenDateTime.plusSeconds(GIGA_SECOND)

    constructor(givenDate: LocalDate) : this(givenDate.atStartOfDay())
}
