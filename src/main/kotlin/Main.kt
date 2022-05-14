fun main() {
    val beenOnline = 10*60*60

    println(agoToText(beenOnline))
}

fun agoToText (time : Int) = when {
       time < 60 -> "был(а) только что"
       time < 60*60 -> "был(а) ${time/60} ${minuteMessage(time)} назад"
       time < 24*60*60 -> "был(а) в сети ${time/(60*60)} ${hourMessage(time)} назад"
       time < 48*60*60 -> "был(а) в сети сегодня"
       time < 72*60*60 -> "был(а) в сети вчера"
       else -> "был(а) в сети давно"
    }

fun minuteMessage (time : Int) : String {
    if (time == 11 * 60) return "минут"

    val lastChar = (time/60) % 10
    return when (lastChar) {
        1 -> "минуту"
        2, 3, 4 -> "минуты"
        else -> "минут"
    }
}

fun hourMessage (time : Int) : String {
    if (time == 11 * 60 * 60) return "часов"

    val lastChar = (time/(60*60)) % 10
    return when (lastChar) {
        1 -> "час"
        2, 3, 4 -> "часа"
        else -> "часов"
    }
}

