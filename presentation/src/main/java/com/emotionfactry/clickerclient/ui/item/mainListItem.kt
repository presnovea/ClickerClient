package com.emotionfactry.clickerclient.ui.item

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MainListItem(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        ){
        Column(){

        }
        Column {

        }
        Column {

        }
    }
}

@Composable
private fun ItemIcon(){

}



@Preview
@Composable
fun Mock(){
    Surface(modifier = Modifier.fillMaxSize()){
        MainListItem()
    }
}

@Composable
private fun ClickerUnitDivider(){
    Divider()
}
