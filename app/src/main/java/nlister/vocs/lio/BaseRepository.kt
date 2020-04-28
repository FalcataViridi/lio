package nlister.vocs.lio

import nlister.vocs.lio.services.AppDatabase

abstract class BaseRepository {
    protected val mAppDatabase = AppDatabase.getInstance()
}