package nlister.vocs.lio.model
import java.util.*


data class MainListItemData(val id: String = Time("A")) {
    var name: String? = ""
    val listType: String? = ""
    var description: String? = ""
    val status: String? = ""
}

data class ShoppingListItemData(val id: String = Time("S")) {
    var name: String = ""
    var cantidad: String = ""
    val status: String = ""
}

fun Time(type: String): String {
    return type + Date()
}

