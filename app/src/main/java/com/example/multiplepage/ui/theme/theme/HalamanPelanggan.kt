package com.example.multiplepage.ui.theme.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.multiplepage.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanPelanggan(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
){
    var nama by remember { mutableStateOf("") }
    var noTelp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var ListData: MutableList<String> = mutableListOf(nama, noTelp, alamat)

    Column {
        OutlinedTextField(value = nama,
            onValueChange = {nama =it},
            label = { Text(text = "Nama") }
        )
        OutlinedTextField(value = noTelp,
            onValueChange = {noTelp =it},
            label = { Text(text = "Telepon") }
        )
        OutlinedTextField(value = alamat,
            onValueChange = {alamat =it},
            label = { Text(text = "Alamat") }
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {onSubmitButtonClicked(ListData)}) {
            Text(stringResource(id = R.string.btn_submit))
        }
    }
}