package org.wit.hillfort.models.room

import android.content.Context
import androidx.room.Room
import org.wit.hillfort.models.HillfortModel
import org.wit.hillfort.models.HillfortStore

class HillfortStoreRoom(val context: Context) : HillfortStore {

    var dao: HillfortDao

    init {
        val database = Room.databaseBuilder(context, Database::class.java, "sample_hillforts.db")
            .fallbackToDestructiveMigration()
            .build()
        dao = database.HillfortDao()
    }

    override fun findAll(): List<HillfortModel> {
        return dao.findAll()
    }

    override fun findById(id: Long): HillfortModel? {
        return dao.findById(id)
    }

    override fun create(hillfort: HillfortModel) {
        dao.create(hillfort)
    }

    override fun update(hillfort: HillfortModel) {
        dao.update(hillfort)
    }

    override fun delete(hillfort: HillfortModel) {
        dao.delete(hillfort)
    }
}