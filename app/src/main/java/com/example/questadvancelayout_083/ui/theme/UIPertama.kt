package com.example.questadvancelayout_083.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ActifitasPertama(modifier: Modifier){
    Column(modifier = Modifier.padding(top=100.dp)
        .filMaxSize(),
        horizontalAlignment = Alighment.CenterHorizontally
    ) {
        Text( text = stringResource( id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
    }
}
