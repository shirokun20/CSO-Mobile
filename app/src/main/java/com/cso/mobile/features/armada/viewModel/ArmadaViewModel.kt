package com.cso.mobile.features.armada.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cso.mobile.features.armada.model.JadwalModel
import com.cso.mobile.features.armada.repository.ArmadaRepository
import kotlinx.coroutines.launch

sealed class ArmadaState {
    object Loading : ArmadaState()
    data class Success(val data: List<JadwalModel>) : ArmadaState()
    data class Error(val errorMessage: String) : ArmadaState()
}

class ArmadaViewModel : ViewModel() {
    private val repository = ArmadaRepository()
    private val _state = mutableStateOf<ArmadaState>(ArmadaState.Loading)
    val state: State<ArmadaState> = _state

    init {
        fetchJadwal()
    }

    fun fetchJadwal() {
        viewModelScope.launch {
            try {
                val data = repository.getJadwal()
                if (data.tiketux.result.isNotEmpty()) {
                    val response = data.tiketux.result
                    _state.value = ArmadaState.Success(response)
                }
            } catch (e: Exception) {
                _state.value = ArmadaState.Error(e.message ?: "An error occurred")
            }
        }
    }
}