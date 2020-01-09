package org.wit.hillfort.activities

import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.startActivityForResult
import org.wit.hillfort.main.MainApp
import org.wit.hillfort.models.HillfortModel

class HillfortListPresenter(val view: HillfortListActivity) {

    var app: MainApp

    init {
        app = view.application as MainApp
    }

    fun getHillforts() = app.hillforts.findAll()

    fun doAddHillfort() {
        view.startActivityForResult<HillfortActivity>(0)
    }

    fun doEditHillfort(hillfort: HillfortModel) {
        view.startActivityForResult(view.intentFor<HillfortActivity>().putExtra("hillfort_edit", hillfort), 0)
    }

    fun doShowPlacemarksMap() {
        view.startActivity<HillfortMapsActivity>()
    }
}
