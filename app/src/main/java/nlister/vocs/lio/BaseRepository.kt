package nlister.vocs.lio

import nlister.vocs.lio.services.AppDatabase

class BaseRepository {
    val mAppDatabase = AppDatabase.getInstance()
}