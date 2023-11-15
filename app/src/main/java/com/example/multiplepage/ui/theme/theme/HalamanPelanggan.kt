package com.example.multiplepage.ui.theme.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun HalamanPelanggan(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
){
    var nama by remember { mutableStateOf("") }
    var noTelp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var ListData: MutableList<String> = mutableListOf(nama, noTelp, alamat)
}