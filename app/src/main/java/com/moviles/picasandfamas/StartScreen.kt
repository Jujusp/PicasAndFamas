package com.moviles.picasandfamas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.PicasAndFamasTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(){
    Scaffold{
        val paddingValues = it
        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 40.dp)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            StartScreenContent()
        }
    }

}

@Composable
fun StartScreenContent(){
    Welcome()
    Buttons()
}

@Composable
fun Welcome(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Text(text = stringResource(id = R.string.start_welcome), style =  MaterialTheme.typography.headlineLarge)
        LogoElement()
    }
}

@Composable
fun LogoElement(){
    Image(
        modifier = Modifier
            .fillMaxWidth(),
        painter = painterResource(R.drawable.ic_logopicas),
        contentDescription = stringResource(id = R.string.start_logo_description),
        contentScale = ContentScale.FillWidth,
        colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onBackground),
    )
}

@Composable
fun Buttons()
{
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
            ){
        OutlinedButton(onClick = {}, modifier = Modifier.padding(bottom = 10.dp)) {
            Text(
                text = stringResource(id = R.string.start_create_room),
                style = MaterialTheme.typography.headlineMedium
            )
        }
        Button(onClick = {}) {
            Text(
                text = stringResource(id = R.string.start_join_room),
                style = MaterialTheme.typography.displaySmall
            )

        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview() {
    PicasAndFamasTheme {
        StartScreen()
    }
}