package com.cso.mobile.features.tiket.presentation.contentChild

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.cso.mobile.components.widget.LoadingComponent
import com.cso.mobile.features.tiket.viewModel.TiketItemState
import com.cso.mobile.features.tiket.viewModel.TiketItemViewModel
import com.cso.mobile.features.tiket.viewModel.TiketState
import com.cso.mobile.features.tiket.viewModel.TiketViewModel

@Composable
fun TiketTab1(navController: NavHostController, vm: TiketViewModel = viewModel()) {
    val state: State<TiketState> = vm.stateTiket

    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Text(
            text = "Pick Up",
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        when (val currentState = state.value) {
            is TiketState.Loading -> {
                LoadingComponent()
            }

            is TiketState.Success -> {
                currentState.data.forEachIndexed { index, item ->
                    val tiketItemViewModel = remember { TiketItemViewModel(title = item.nama) }
                    TiketTab1Card(
                        title = item.nama.lowercase().replaceFirstChar { it.uppercase() },
                        jam = item.jam_berangkat,
                        headerWidget = {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 10.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                TiketTab1Label(
                                    modifier = Modifier
                                        .weight(4f)
                                        .padding(end = 10.dp),
                                    title = if (index == 0) "Tujuan" else "Pickup",
                                )
                                TiketTab1Label(
                                    modifier = Modifier
                                        .weight(2f)
                                        .padding(end = 10.dp),
                                    title = "Harga",
                                )
                                TiketTab1Label(
                                    modifier = Modifier
                                        .weight(1f),
                                    title = "Kursi",
                                    alignText = TextAlign.Center,
                                )
                            }
                        },
                        contentWidget = {
                            TiketTab1CardItem(
                                tujuan = item.nama,
                                navController = navController,
                                vm = tiketItemViewModel
                            )
                        }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

            is TiketState.Error -> {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = currentState.errorMessage, style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF000000),
                            )
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun TiketTab1CardItem(
    tujuan: String,
    navController: NavHostController,
    vm: TiketItemViewModel = viewModel()
) {
    LaunchedEffect(Unit) {
        vm.fetchJadwalTujuan(title = tujuan)
    }

    val state: State<TiketItemState> = vm.stateTiketItem

    when (val currentState = state.value) {
        is TiketItemState.Loading -> {
            Box(
                modifier = Modifier
                    .border(
                        border = BorderStroke(1.dp, Color(0xFFEBEEF4)),
                        shape = RoundedCornerShape(size = 6.dp)
                    )
                    .clip(shape = RoundedCornerShape(size = 6.dp))
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 6.dp)
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TiketTab1Item(
                        modifier = Modifier,
                        alignText = TextAlign.Center,
                        title = "Sedang mengambil data",
                        fontSize = 12.sp,
                    )
                }
            }
        }

        is TiketItemState.Empty -> {
            Box(
                modifier = Modifier
                    .border(
                        border = BorderStroke(1.dp, Color(0xFFEBEEF4)),
                        shape = RoundedCornerShape(size = 6.dp)
                    )
                    .clip(shape = RoundedCornerShape(size = 6.dp))
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 6.dp)
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TiketTab1Item(
                        modifier = Modifier,
                        alignText = TextAlign.Center,
                        title = "Belum ada tujuan",
                        fontSize = 12.sp,
                    )
                }
            }
        }

        is TiketItemState.Error -> {
            Box(
                modifier = Modifier
                    .border(
                        border = BorderStroke(1.dp, Color(0xFFEBEEF4)),
                        shape = RoundedCornerShape(size = 6.dp)
                    )
                    .clip(shape = RoundedCornerShape(size = 6.dp))
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 6.dp)
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TiketTab1Item(
                        modifier = Modifier,
                        alignText = TextAlign.Center,
                        title = currentState.errorMessage,
                        fontSize = 12.sp,
                    )
                }
            }
        }

        is TiketItemState.Success -> {
            repeat(currentState.data.size) { index ->
                Box(
                    modifier = Modifier
                        .border(
                            border = BorderStroke(1.dp, Color(0xFFEBEEF4)),
                            shape = RoundedCornerShape(size = 6.dp)
                        )
                        .clip(shape = RoundedCornerShape(size = 6.dp))
                        .clickable(
                            onClick = {
                                navController.navigate("takeChair")
                            }
                        )
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(size = 6.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        TiketTab1Item(
                            modifier = Modifier
                                .weight(4f)
                                .padding(end = 10.dp),
                            title = currentState.data[index].nama.lowercase()
                                .replaceFirstChar { it.uppercase() },
                            fontSize = 12.sp,
                        )
                        TiketTab1Item(
                            modifier = Modifier
                                .weight(2f)
                                .padding(end = 10.dp),
                            title = currentState.data[index].tarif_str,
                        )
                        TiketTab1Item(
                            modifier = Modifier
                                .weight(1f),
                            title = "${currentState.data[index].kapasitas}",
                            alignText = TextAlign.Center,
                        )

                    }
                }
                if (!(index == currentState.data.size - 1)) Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}