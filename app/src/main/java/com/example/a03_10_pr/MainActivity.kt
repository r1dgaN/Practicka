package com.example.a03_10_pr

import android.media.Image
import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a03_10_pr.ui.theme._03_10_prTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _03_10_prTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun ComposeArticle() {
    Statya(
        title = stringResource(R.string.t1),
        shortText = stringResource(R.string.t2),
        longText = stringResource(R.string.t3),
        image = painterResource(R.drawable.bg_compose_background)
    )
}


@Composable
fun Statya(
    title: String,
    shortText: String,
    longText: String,
    image: Painter,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null
        )

        Text(
            text = stringResource(R.string.t1),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp,
        )
        Text(
            text = stringResource(R.string.t2),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify

        )
        Text(
            text = stringResource(R.string.t3),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify

        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _03_10_prTheme {
        ComposeArticle()
    }
}