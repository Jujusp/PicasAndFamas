package com.moviles.picasandfamas

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.PicasAndFamasTheme
import kotlinx.coroutines.delay


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnterInformationScreen(){

    Scaffold(
        topBar = { TopBarName() }
    ) {
        Column(modifier = Modifier.padding(it)){
            var visible by remember { mutableStateOf(false) }
            AnimatedVisibility(
                visible = visible,
                // Set the start width to 20 (pixels), 0 by default
                enter = expandHorizontally { 20 },
                exit = shrinkHorizontally(
                    // Overwrites the default animation with tween for this shrink animation.
                    animationSpec = tween(),
                    // Shrink towards the end (i.e. right edge for LTR, left edge for RTL). The default
                    // direction for the shrink is towards [Alignment.Start]
                    shrinkTowards = Alignment.End,
                ) { fullWidth ->
                    // Set the end width for the shrink animation to a quarter of the full width.
                    fullWidth / 4
                }
            ) {
                // Content that needs to appear/disappear goes here:
                Box(
                    Modifier
                        .fillMaxWidth()
                        .requiredHeight(200.dp)
                        .padding(it),

                )
                {
                    Text("Holaaaaaaaaaaaaaaaaaaaaaaaaaa")

                }
            }
            
            LaunchedEffect(key1 = true){
                visible = false
                delay(4000)
                visible = true
            }
        }
    }
}

@Composable
fun handleInputFields(){

}

@Composable
fun EnterFieldValue(){
    var text by rememberSaveable { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") },
        singleLine = true
    )
}

@Preview
@Composable
fun EnterInfoScreenPreview(){
    PicasAndFamasTheme {
        EnterInformationScreen()
    }
}