package com.cso.mobile.features.report.viewModel

import androidx.lifecycle.ViewModel
import com.cso.mobile.features.report.model.ReportDataModel

class ReportViewModel : ViewModel() {
    // List ReportDataModel yang akan diisi
    val sampleDataOffline: List<ReportDataModel> = listOf(
        ReportDataModel(
            id = 1,
            tiket = 69,
            total = "31.245.000",
            komisi = 0,
            setoran = "31.245.000"
        ),
    )

    val sampleDataOnline: List<ReportDataModel> = listOf(
        ReportDataModel(
            id = 1,
            tiket = 2,
            total = "680.00",
            komisi = 0,
            setoran = "0"
        )
    )

    val sampleContentOffline: List<ReportDataModel> = listOf(
        ReportDataModel(
            id = 1,
            tiket = 2,
            total = "380.000",
            komisi = 0,
            setoran = "380.000"
        ),
    )

    val sampleContentOnline: List<ReportDataModel> = listOf(
        ReportDataModel(
            id = 1,
            tiket = 2,
            total = "680.00",
            komisi = 0,
            setoran = "0"
        )
    )
}