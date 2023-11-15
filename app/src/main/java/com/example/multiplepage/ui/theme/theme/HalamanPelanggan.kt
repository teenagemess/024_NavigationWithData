package com.example.multiplepage.ui.theme.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
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
    onCancelButtonClicked: () -> Unit,
){
    var nama by remember { mutableStateOf("") }
    var noTelp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var ListData: MutableList<String> = mutableListOf(nama, noTelp, alamat)

    Column(modifier = Modifier.padding(10.dp)) {
        OutlinedTextField(value = nama,
            onValueChange = {nama =it},
            label = { Text(text = "Nama") },
            modifier = Modifier.fillMaxWidth()

        )
        OutlinedTextField(value = noTelp,
            onValueChange = {noTelp =it},
            label = { Text(text = "Telepon") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(value = alamat,
            onValueChange = {alamat =it},
            label = { Text(text = "Alamat") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(30.dp))
        Row() {
            OutlinedButton(modifier = Modifier.weight(1f),onClick = onCancelButtonClicked) {
                Text(text = stringResource(R.string.cancel))
            }
            Button(onClick = {onSubmitButtonClicked(ListData)}) {
                Text(stringResource(id = R.string.btn_submit))
            }
        }
    }
}