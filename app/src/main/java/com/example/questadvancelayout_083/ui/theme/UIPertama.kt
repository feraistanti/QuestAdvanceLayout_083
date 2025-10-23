package com.example.questadvancelayout_083.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questadvancelayout_083.R
import com.example.questadvancelayout_083.ui.theme.logo_umy

private val Int.dpp: Any

@Composable
fun ActifitasPertama(modifier: Modifier){
    Column(modifier = Modifier.padding(top=100.dp)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource( R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text( stringResource( R.string.univ),
            fontSize = 22.sp)
        Spacer(modifier = Modifier.height( 25.dp))
        Card (modifier = Modifier
            .fillMaxWidth( 1f)
            .padding( all = 12.dp),
            colors = CardDefaults.cardColors(
                ContainerColor = Color.DarkGray
            )) {
                Row() {
                    val gambar = painterResource( R.drawable.logo_umy)
                    image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier.size(100.dp).padding(5.dpp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    val column = null
                    column
                        Text(
                            stringResource(R.string.nama),
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.White,
                            modifier = Modifier.padding(top=15.dp)
                        )
                        Text(
                            stringResource(R.string.alamat),
                            fontSize = 20.sp,
                            color = Color.Yellow,
                            modifier = Modifier.padding(top=10.dp)
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                        ){
                            text(
                                stringResource(R.string.copy),
                            )
                        }
                }
    }
    }
}



