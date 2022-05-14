fun main() {
    val beenOnline = 10*60*60

    println(agoToText(beenOnline))
}

fun agoToText (time : Int) = when {
       time < 60 -> "���(�) ������ ���"
       time < 60*60 -> "���(�) ${time/60} ${minuteMessage(time)} �����"
       time < 24*60*60 -> "���(�) � ���� ${time/(60*60)} ${hourMessage(time)} �����"
       time < 48*60*60 -> "���(�) � ���� �������"
       time < 72*60*60 -> "���(�) � ���� �����"
       else -> "���(�) � ���� �����"
    }

fun minuteMessage (time : Int) : String {
    if (time == 11 * 60) return "�����"

    val lastChar = (time/60) % 10
    return when (lastChar) {
        1 -> "������"
        2, 3, 4 -> "������"
        else -> "�����"
    }
}

fun hourMessage (time : Int) : String {
    if (time == 11 * 60 * 60) return "�����"

    val lastChar = (time/(60*60)) % 10
    return when (lastChar) {
        1 -> "���"
        2, 3, 4 -> "����"
        else -> "�����"
    }
}

