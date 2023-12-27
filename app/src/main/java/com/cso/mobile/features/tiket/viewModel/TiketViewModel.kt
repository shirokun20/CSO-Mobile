package com.cso.mobile.features.tiket.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cso.mobile.features.tiket.model.TiketModel
import com.cso.mobile.features.tiket.repository.TiketRepository
import kotlinx.coroutines.launch

sealed class TiketState {
    object Loading : TiketState()
    data class Success(val data: List<TiketModel>) : TiketState()
    data class Error(val errorMessage: String) : TiketState()
}

class TiketViewModel : ViewModel() {
    private val repository = TiketRepository()

    private val _stateTiket = mutableStateOf<TiketState>(TiketState.Loading)

    val stateTiket: State<TiketState> = _stateTiket

    init {
        fetchJadwalAsal()
    }

    fun fetchJadwalAsal() {
        viewModelScope.launch {
            try {
                val data = repository.getJadwalAsal()
                if (data.tiketux.result.isNotEmpty()) {
                    val response = data.tiketux.result
                    _stateTiket.value = TiketState.Success(response)
                }
            } catch (e: Exception) {
                _stateTiket.value = TiketState.Error(e.message ?: "An error occurred")
            }
        }
    }
}