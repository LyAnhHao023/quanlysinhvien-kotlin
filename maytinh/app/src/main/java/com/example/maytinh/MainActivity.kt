package com.example.maytinh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.maytinh.ui.theme.MaytinhTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaytinhTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MayTinh()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MayTinh( modifier: Modifier = Modifier) {
    var fnumber by remember {
        mutableStateOf("")
    }
    var lnumber by remember {
        mutableStateOf("")
    }
    var ketqua by remember {
        mutableStateOf("")
    }
    Scaffold(
        modifier = modifier.padding(5.dp),
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Blue,
                    titleContentColor = Color.White
                ),
                title ={
                    Text(text = "Máy tính", fontWeight = FontWeight.ExtraBold)
                }
            )

        }
    ) {
            it->
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(it)
        ) {
            TextField(
                value = fnumber,
                onValueChange ={fnumber=it},
                modifier = modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                trailingIcon ={
                    Text(text = "Nhập số thứ nhất", color = Color.Gray)},
                label ={ Text(text = "")}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MayTinh();
}