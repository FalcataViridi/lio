package nlister.vocs.lio.model


data class MainListItemData(val id: Long
                                , var name: String = ""
                                , val listType: String = ""
                                , var description: String = ""
                                , val status: String = "")

data class ShoppingListItemData(val id: Long
                                    , var name: String = ""
                                    , var cantidad: String = ""
                                    , val status: String = "")
