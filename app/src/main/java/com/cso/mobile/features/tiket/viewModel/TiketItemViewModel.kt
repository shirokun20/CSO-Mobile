package com.cso.mobile.features.tiket.viewModel

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cso.mobile.features.tiket.model.TiketItemModel
import com.cso.mobile.features.tiket.repository.TiketRepository
import kotlinx.coroutines.launch

sealed class TiketItemState {
    object Loading : TiketItemState()
    data class Empty(val hasil: String) : TiketItemState()
    data class Success(val data: List<TiketItemModel>) : TiketItemState()
    data class Error(val errorMessage: String) : TiketItemState()
}

class TiketItemViewModel(title: String) : ViewModel() {
    private val repository = TiketRepository()
    private val _stateTiketItem = mutableStateOf<TiketItemState>(TiketItemState.Loading)
    val stateTiketItem: State<TiketItemState> = _stateTiketItem

    init {
        Log.i("View Model", title)
    }

    fun fetchJadwalTujuan(title: String) {
        viewModelScope.launch {
            try {
                val data = repository.getJadwalTujuan()
                if (data.tiketux.result.isNotEmpty()) {
                    Log.i("Cari: ", title)
                    val response = data.tiketux.result.filter { item ->
                        item.rute.lowercase().contains(title.lowercase())
                    }
                    Log.i("Hasil Cari: ", response.size.toString())
                    if (response.isNotEmpty()) {
                        _stateTiketItem.value = TiketItemState.Success(response)
                    } else {
                        _stateTiketItem.value = TiketItemState.Empty(hasil = "")
                    }
                    Log.i("Hasil Cari State: ", "${_stateTiketItem.value}")
                } else {
                    _stateTiketItem.value = TiketItemState.Empty(hasil = "")
                }
            } catch (e: Exception) {
                _stateTiketItem.value = TiketItemState.Error(e.message ?: "An error occurred")
            }
        }
    }
}