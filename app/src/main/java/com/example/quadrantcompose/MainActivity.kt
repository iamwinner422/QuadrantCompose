package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    QuadrantApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun QuadrantApp(modifier: Modifier = Modifier){

}

@Composable
fun TextComposable(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background()
    ) {
        Text(
            text = stringResource(R.string.title_1),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.description_1),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantComposeTheme {
        TextComposable()
    }
}